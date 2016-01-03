(ns fourclojure.scraper
  (:require [clojure.xml :as xml]
            [clojure.zip :as zip]
            [clojure.string :as string]
            [clojure.data.zip.xml :as zip-xml])
  (:import (java.io ByteArrayInputStream)))

(defn- debug [x] (println x) x)

(defn erase
  "Erase bad stuff from s. bad is a space-delimited list of stuff"
  [s bad]
  (reduce (fn [s bad] (string/replace s bad "")) s (string/split bad #" ")))

(defn problem-uri [problem-id]
  (str "http://www.4clojure.com/problem/" problem-id))

(defn parse-str [s]
  (try
    (-> s (erase "&nbsp; <br>") (string/replace "&" "&amp;")
        .getBytes ByteArrayInputStream. xml/parse)
    (catch Exception e (println s) (throw e))))

(defn parse-zipped-html
  [zipped]
  (let [container (zip-xml/xml1-> zipped
                                  :body
                                  :div (zip-xml/attr= :id "content")
                                  :div (zip-xml/attr= :id "content_body")
                                  :div (zip-xml/attr= :id "prob-container"))
        about (seq (zip-xml/xml-> container :table :tr :td zip-xml/text))
        prob-desc (zip-xml/xml1-> container :div (zip-xml/attr= :id "prob-desc"))
        problems (zip-xml/xml-> prob-desc :table :tr :td zip-xml/text)]
    {:number (->> (zip-xml/xml1-> container
                                  :div (zip-xml/attr= :id "prob-number")
                                  zip-xml/text)
                  rest (apply str) Integer/valueOf)
     :title (zip-xml/xml1-> container
                            :div (zip-xml/attr= :id "prob-title")
                            zip-xml/text)
     :difficulty (nth about 1)
     :topics (nth about 3)
     :description (->> prob-desc first :content (filter string?) first)
     :problems (filter #(not (.isEmpty %)) problems)
     }))

(defn scrape-problem
  "Get a single problem from 4closure site and convert it into something"
  [problem_id]
  (-> problem_id debug problem-uri slurp parse-str zip/xml-zip parse-zipped-html))

(defn format-problem
  [p]
  (format
"
(defn p%s
  \"
  %s
  %s
  Difficulty: %s
  \"
  []
  (let [__ nil]
%s))
"
    (p :number)
    (p :title)
    (p :description)
    (p :difficulty)
    (string/join "\n" (map #(str "    (assert " % ")") (p :problems)))))

(defn check-problem [p]
  (assert (not (nil? (p :number))))
  (assert (not (nil? (p :title))))
  (assert (not (nil? (p :difficulty))))
  p)

(defn fetch-parse-format [problem-id]
  (try
    (-> problem-id scrape-problem check-problem format-problem)
    (catch Exception e
      (println "Error fetching " problem-id ": " (.getMessage e)) "")))

(defn bring-it-together []
  (spit "src/fourclojure/problems.clj"
        (apply str "(ns fourclojure.scraper)\n\n"
               (map fetch-parse-format (range 1 159)))))

