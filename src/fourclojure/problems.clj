
(defn p1
  "
  Nothing but the Truth
  This is a clojure form.  Enter a value which will make the form evaluate to true.  Don't over think it!  If you are confused, see the 
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ true))))

(defn p2
  "
  Simple Math
  null
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= (- 10 (* 2 3)) __))))

(defn p3
  "
  Intro to Strings
  Clojure strings are Java strings.  This means that you can use any of the Java string methods on Clojure strings.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (.toUpperCase "hello world")))))

(defn p4
  "
  Intro to Lists
  Lists can be constructed with either a function or a quoted form.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= (list __) '(:a :b :c)))))

(defn p5
  "
  Lists: conj
  null
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (conj '(2 3 4) 1)))
    (assert (= __ (conj '(3 4) 2 1)))))

(defn p6
  "
  Intro to Vectors
  Vectors can be constructed several ways.  You can compare them with lists.

  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))))

(defn p7
  "
  Vectors: conj
  When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (conj [1 2 3] 4)))
    (assert (= __ (conj [1 2] 3 4)))))

(defn p8
  "
  Intro to Sets
  Sets are collections of unique values.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (set '(:a :a :b :c :c :c :c :d :d))))
    (assert (= __ (clojure.set/union #{:a :b :c} #{:b :c :d})))))

(defn p9
  "
  Sets: conj
  When operating on a set, the conj function returns a new set with one or more keys "added".
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= #{1 2 3 4} (conj #{1 4 3} __)))))

(defn p10
  "
  Intro to Maps
  Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ ((hash-map :a 10, :b 20, :c 30) :b)))
    (assert (= __ (:b {:a 10, :b 20, :c 30})))))

(defn p11
  "
  Maps: conj
  When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3])))))

(defn p12
  "
  Intro to Sequences
  All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (first '(3 2 1))))
    (assert (= __ (second [2 3 4])))
    (assert (= __ (last (list 1 2 3))))))

(defn p13
  "
  Sequences: rest
  The rest function will return all the items of a sequence except the first.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (rest [10 20 30 40])))))

(defn p14
  "
  Intro to Functions
  Clojure has many different ways to create functions.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ ((fn add-five [x] (+ x 5)) 3)))
    (assert (= __ ((fn [x] (+ x 5)) 3)))
    (assert (= __ (#(+ % 5) 3)))
    (assert (= __ ((partial + 5) 3)))))

(defn p15
  "
  Double Down
  Write a function which doubles a number.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= (__ 2) 4))
    (assert (= (__ 3) 6))
    (assert (= (__ 11) 22))
    (assert (= (__ 7) 14))))

(defn p16
  "
  Hello World
  Write a function which returns a personalized greeting.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= (__ "Dave") "Hello, Dave!"))
    (assert (= (__ "Jenn") "Hello, Jenn!"))
    (assert (= (__ "Rhea") "Hello, Rhea!"))))

(defn p17
  "
  Sequences: map
  The map function takes two arguments: a function (f) and a sequence (s).  Map returns a new sequence consisting of the result of applying f to each item of s.  Do not confuse the map function with the map data structure.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (map #(+ % 5) '(1 2 3))))))

(defn p18
  "
  Sequences: filter
  The filter function takes two arguments: a predicate function (f) and a sequence (s).  Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (filter #(> % 5) '(3 4 5 6 7))))))

(defn p19
  "
  Last Element
  Write a function which returns the last element in a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3 4 5]) 5))
    (assert (= (__ '(5 4 3)) 3))
    (assert (= (__ ["b" "c" "d"]) "d"))))

(defn p20
  "
  Penultimate Element
  Write a function which returns the second to last element from a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ (list 1 2 3 4 5)) 4))
    (assert (= (__ ["a" "b" "c"]) "b"))
    (assert (= (__ [[1 2] [3 4]]) [1 2]))))

(defn p21
  "
  Nth Element
  Write a function which returns the Nth element from a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ '(4 5 6 7) 2) 6))
    (assert (= (__ [:a :b :c] 0) :a))
    (assert (= (__ [1 2 3 4] 1) 2))
    (assert (= (__ '([1 2] [3 4] [5 6]) 2) [5 6]))))

(defn p22
  "
  Count a Sequence
  Write a function which returns the total number of elements in a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ '(1 2 3 3 1)) 5))
    (assert (= (__ "Hello World") 11))
    (assert (= (__ [[1 2] [3 4] [5 6]]) 3))
    (assert (= (__ '(13)) 1))
    (assert (= (__ '(:a :b :c)) 3))))

(defn p23
  "
  Reverse a Sequence
  Write a function which reverses a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3 4 5]) [5 4 3 2 1]))
    (assert (= (__ (sorted-set 5 7 2 7)) '(7 5 2)))
    (assert (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]))))

(defn p24
  "
  Sum It All Up
  Write a function which returns the sum of a sequence of numbers.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3]) 6))
    (assert (= (__ (list 0 -2 5 5)) 8))
    (assert (= (__ #{4 2 1}) 7))
    (assert (= (__ '(0 0 -1)) -1))
    (assert (= (__ '(1 10 3)) 14))))

(defn p25
  "
  Find the odd numbers
  Write a function which returns only the odd numbers from a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ #{1 2 3 4 5}) '(1 3 5)))
    (assert (= (__ [4 2 1 6]) '(1)))
    (assert (= (__ [2 2 4 6]) '()))
    (assert (= (__ [1 1 1 3]) '(1 1 1 3)))))

(defn p26
  "
  Fibonacci Sequence
  Write a function which returns the first X fibonacci numbers.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 3) '(1 1 2)))
    (assert (= (__ 6) '(1 1 2 3 5 8)))
    (assert (= (__ 8) '(1 1 2 3 5 8 13 21)))))

(defn p27
  "
  Palindrome Detector
  Write a function which returns true if the given sequence is a palindrome.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (false? (__ '(1 2 3 4 5))))
    (assert (true? (__ "racecar")))
    (assert (true? (__ [:foo :bar :foo])))
    (assert (true? (__ '(1 1 3 3 1 1))))
    (assert (false? (__ '(:a :b :c))))))

(defn p28
  "
  Flatten a Sequence
  Write a function which flattens a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
    (assert (= (__ ["a" ["b"] "c"]) '("a" "b" "c")))
    (assert (= (__ '((((:a))))) '(:a)))))

(defn p29
  "
  Get the Caps
  Write a function which takes a string and returns a new string containing only the capital letters.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ "HeLlO, WoRlD!") "HLOWRD"))
    (assert (empty? (__ "nothing")))
    (assert (= (__ "$#A(*&987Zf") "AZ"))))

(defn p30
  "
  Compress a Sequence
  Write a function which removes consecutive duplicates from a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (apply str (__ "Leeeeeerrroyyy")) "Leroy"))
    (assert (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
    (assert (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))))

(defn p31
  "
  Pack a Sequence
  Write a function which packs consecutive duplicates into sub-lists.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
    (assert (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
    (assert (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))

(defn p32
  "
  Duplicate a Sequence
  Write a function which duplicates each element of a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3]) '(1 1 2 2 3 3)))
    (assert (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
    (assert (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
    (assert (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))))

(defn p33
  "
  Replicate a Sequence
  Write a function which replicates each element of a sequence a variable number of times.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3] 2) '(1 1 2 2 3 3)))
    (assert (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
    (assert (= (__ [4 5 6] 1) '(4 5 6)))
    (assert (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
    (assert (= (__ [44 33] 2) [44 44 33 33]))))

(defn p34
  "
  Implement range
  Write a function which creates a list of all integers in a given range.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 1 4) '(1 2 3)))
    (assert (= (__ -2 2) '(-2 -1 0 1)))
    (assert (= (__ 5 8) '(5 6 7)))))

(defn p35
  "
  Local bindings
  Clojure lets you give local names to values using the special let-form.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (let [x 5] (+ 2 x))))
    (assert (= __ (let [x 3, y 10] (- y x))))
    (assert (= __ (let [x 21] (let [y 3] (/ x y)))))))

(defn p36
  "
  Let it Be
  Can you bind x, y, and z so that these are all true?
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= 10 (let __ (+ x y))))
    (assert (= 4 (let __ (+ y z))))
    (assert (= 1 (let __ z)))))

(defn p37
  "
  Regular Expressions
  Regex patterns are supported with a special reader macro.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))))

(defn p38
  "
  Maximum value
  Write a function which takes a variable number of parameters and returns the maximum value.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 1 8 3 4) 8))
    (assert (= (__ 30 20) 30))
    (assert (= (__ 45 67 11) 67))))

(defn p39
  "
  Interleave Two Seqs
  Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
    (assert (= (__ [1 2] [3 4 5 6]) '(1 3 2 4)))
    (assert (= (__ [1 2 3 4] [5]) [1 5]))
    (assert (= (__ [30 20] [25 15]) [30 25 20 15]))))

(defn p40
  "
  Interpose a Seq
  Write a function which separates the items of a sequence by an arbitrary value.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 0 [1 2 3]) [1 0 2 0 3]))
    (assert (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three"))
    (assert (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))))

(defn p41
  "
  Drop Every Nth Item
  Write a function which drops every Nth item from a sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
    (assert (= (__ [:a :b :c :d :e :f] 2) [:a :c :e]))
    (assert (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6]))))

(defn p42
  "
  Factorial Fun
  Write a function which calculates factorials.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 1) 1))
    (assert (= (__ 3) 6))
    (assert (= (__ 5) 120))
    (assert (= (__ 8) 40320))))

(defn p43
  "
  Reverse Interleave
  Write a function which reverses the interleave process into x number of subsequences.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
    (assert (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
    (assert (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))))

(defn p44
  "
  Rotate Sequence
  Write a function which can rotate a sequence in either direction.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2)))
    (assert (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3)))
    (assert (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1)))
    (assert (= (__ 1 '(:a :b :c)) '(:b :c :a)))
    (assert (= (__ -4 '(:a :b :c)) '(:c :a :b)))))

(defn p45
  "
  Intro to Iterate
  The iterate function can be used to produce an infinite lazy sequence.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= __ (take 5 (iterate #(+ 3 %) 1))))))

(defn p46
  "
  Flipping out
  Write a higher-order function which flips the order of the arguments of an input function.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= 3 ((__ nth) 2 [1 2 3 4 5])))
    (assert (= true ((__ >) 7 8)))
    (assert (= 4 ((__ quot) 2 8)))
    (assert (= [1 2 3] ((__ take) [1 2 3 4 5] 3)))))

(defn p47
  "
  Contain Yourself
  The contains? function checks if a KEY is present in a given collection.  This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (contains? #{4 5 6} __))
    (assert (contains? [1 1 1 1 1] __))
    (assert (contains? {4 :a 2 :b} __))
    (assert (not (contains? [1 2 4] __)))))

(defn p48
  "
  Intro to some
  The some function takes a predicate function and a collection.  It returns the first logical true value of (predicate x) where x is an item in the collection.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= __ (some #{2 7 6} [5 6 7 8])))
    (assert (= __ (some #(when (even? %) %) [5 6 7 8])))))

(defn p49
  "
  Split a sequence
  Write a function which will split a sequence into two parts.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
    (assert (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
    (assert (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))))

(defn p50
  "
  Split by Type
  Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
    (assert (= (set (__ [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]}))
    (assert (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]}))))

(defn p51
  "
  Advanced Destructuring
  Here is an example of some more sophisticated destructuring.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d])))))

(defn p52
  "
  Intro to Destructuring
  Let bindings and function parameter lists support destructuring.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= [2 4] (let [[a b c d e] [0 1 2 3 4]] __)))))

(defn p53
  "
  Longest Increasing Sub-Seq
  Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3]))
    (assert (= (__ [5 6 1 3 2 7]) [5 6]))
    (assert (= (__ [2 3 3 4 5]) [3 4 5]))
    (assert (= (__ [7 6 5 4]) []))))

(defn p54
  "
  Partition a Sequence
  Write a function which returns a sequence of lists of x items each.  Lists of less than x items should not be returned.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
    (assert (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
    (assert (= (__ 3 (range 8)) '((0 1 2) (3 4 5))))))

(defn p55
  "
  Count Occurrences
  Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
    (assert (= (__ [:b :a :b :a :b]) {:a 2, :b 3}))
    (assert (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))))

(defn p56
  "
  Find Distinct Items
  Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ [1 2 1 3 1 2 4]) [1 2 3 4]))
    (assert (= (__ [:a :a :b :b :c :c]) [:a :b :c]))
    (assert (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
    (assert (= (__ (range 50)) (range 50)))))

(defn p57
  "
  Simple Recursion
  A recursive function is a function which calls itself.  This is one of the fundamental techniques used in functional programming.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))

(defn p58
  "
  Function Composition
  Write a function which allows you to create function compositions.  The parameter list should take a variable number of functions, and create a function that applies them from right-to-left.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= [3 2 1] ((__ rest reverse) [1 2 3 4])))
    (assert (= 5 ((__ (partial + 3) second) [1 2 3 4])))
    (assert (= true ((__ zero? #(mod % 8) +) 3 5 7 9)))
    (assert (= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world")))))

(defn p59
  "
  Juxtaposition
  Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= [21 6 1] ((__ + max min) 2 3 5 1 6 4)))
    (assert (= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello")))
    (assert (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10})))))

(defn p60
  "
  Sequence Reductions
  Write a function which behaves like reduce, but returns each intermediate value of the reduction.  Your function must accept either two or three arguments, and the return sequence must be lazy.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (take 5 (__ + (range))) [0 1 3 6 10]))
    (assert (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
    (assert (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120))))

(defn p61
  "
  Map Construction
  Write a function which takes a vector of keys and a vector of values and constructs a map from them.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
    (assert (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
    (assert (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}))))

(defn p62
  "
  Re-implement Iterate
  Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16]))
    (assert (= (take 100 (__ inc 0)) (take 100 (range))))
    (assert (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3]))))))

(defn p63
  "
  Group a Sequence
  Given a function f and a sequence s, write a function which returns a map.  The keys should be the values of f applied to each item in s.  The value at each key should be a vector of corresponding items in the order they appear in s.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]}))
    (assert (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]]) {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}))
    (assert (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]]) {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]}))))

(defn p64
  "
  Intro to Reduce
   takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= 15 (reduce __ [1 2 3 4 5])))
    (assert (= 0 (reduce __ [])))
    (assert (= 6 (reduce __ 1 [2 3])))))

(defn p65
  "
  Black Box Testing
  Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform "sequence" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= :map (__ {:a 1, :b 2})))
    (assert (= :list (__ (range (rand-int 20)))))
    (assert (= :vector (__ [1 2 3 4 5 6])))
    (assert (= :set (__ #{10 (rand-int 5)})))
    (assert (= [:map :set :vector :list] (map __ [{} #{} [] ()])))))

(defn p66
  "
  Greatest Common Divisor
  Given two integers, write a function which
returns the greatest common divisor.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 2 4) 2))
    (assert (= (__ 10 5) 5))
    (assert (= (__ 5 7) 1))
    (assert (= (__ 1023 858) 33))))

(defn p67
  "
  Prime Numbers
  Write a function which returns the first x
number of prime numbers.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 2) [2 3]))
    (assert (= (__ 5) [2 3 5 7 11]))
    (assert (= (last (__ 100)) 541))))

(defn p68
  "
  Recurring Theme
  Clojure only has one non-stack-consuming looping construct: recur.  Either a function or a loop can be used as the recursion point.  Either way, recur rebinds the bindings of the recursion point to the values it is passed.  Recur must be called from the tail-position, and calling it elsewhere will result in an error.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= __ (loop [x 5 result []] (if (> x 0) (recur (dec x) (conj result (+ 2 x))) result))))))

(defn p69
  "
  Merge with a Function
  Write a function which takes a function f and a variable number of maps.  Your function should return a map that consists of the rest of the maps conj-ed onto the first.  If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the mapping in the result by calling (f val-in-result val-in-latter)
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5}) {:a 4, :b 6, :c 20}))
    (assert (= (__ - {1 10, 2 20} {1 3, 2 10, 3 15}) {1 7, 2 10, 3 15}))
    (assert (= (__ concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]}) {:a [3 4 5], :b [6 7], :c [8 9]}))))

(defn p70
  "
  Word Sorting
  Write a function that splits a sentence up into a sorted list of words.  Capitalization should not affect sort order and punctuation should be ignored.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ "Have a nice day.") ["a" "day" "Have" "nice"]))
    (assert (= (__ "Clojure is a fun language!") ["a" "Clojure" "fun" "is" "language"]))
    (assert (= (__ "Fools fall for foolish follies.") ["fall" "follies" "foolish" "Fools" "for"]))))

(defn p71
  "
  Rearranging Code: ->
  The -> macro threads an expression x through a variable number of forms. First, x is inserted as the second item in the first form, making a list of it if it is not a list already.  Then the first form is inserted as the second item in the second form, making a list of that form if necessary.  This process continues for all the forms.  Using -> can sometimes make your code more readable.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= (__ (sort (rest (reverse [2 5 4 1 3 6])))) (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (__)) 5))))

(defn p72
  "
  Rearranging Code: ->>
  The ->> macro threads an expression x through a variable number of forms. First, x is inserted as the last item in the first form, making a list of it if it is not a list already.  Then the first form is inserted as the last item in the second form, making a list of that form if necessary.  This process continues for all the forms.  Using ->> can sometimes make your code more readable.
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6])))) (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__)) 11))))

(defn p73
  "
  Analyze a Tic-Tac-Toe Board
  A 
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= nil (__ [[:e :e :e] [:e :e :e] [:e :e :e]])))
    (assert (= :x (__ [[:x :e :o] [:x :e :e] [:x :e :o]])))
    (assert (= :o (__ [[:e :x :e] [:o :o :o] [:x :e :x]])))
    (assert (= nil (__ [[:x :e :o] [:x :x :e] [:o :x :o]])))
    (assert (= :x (__ [[:x :e :e] [:o :x :e] [:o :e :x]])))
    (assert (= :o (__ [[:x :e :o] [:x :o :e] [:o :e :x]])))
    (assert (= nil (__ [[:x :o :x] [:x :o :x] [:o :x :o]])))))

(defn p74
  "
  Filter Perfect Squares
  Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ "4,5,6,7,8,9") "4,9"))
    (assert (= (__ "15,16,25,36,37") "16,25,36"))))

(defn p75
  "
  Euler's Totient Function
  Two numbers are coprime if their greatest common divisor equals 1.  Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.  The special case f(1) equals 1.  Write a function which calculates Euler's totient function.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 1) 1))
    (assert (= (__ 10) (count '(1 3 7 9)) 4))
    (assert (= (__ 40) 16))
    (assert (= (__ 99) 60))))

(defn p76
  "
  Intro to Trampoline
  The trampoline function takes a function f and a variable number of parameters.  Trampoline calls f with any parameters that were supplied.  If f returns a function, trampoline calls that function with no arguments.  This is repeated, until the return value is not a function, and then trampoline returns that non-function value.  This is useful for implementing mutually recursive algorithms in a way that won't consume the stack.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= __ (letfn [(foo [x y] #(bar (conj x y) y)) (bar [x y] (if (> (last x) 10) x #(foo x (+ 2 y))))] (trampoline foo [] 1))))))

(defn p77
  "
  Anagram Finder
  Write a function which finds all the anagrams in a vector of words.  A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y.  Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other.  Each sub-set should have at least two words.  Words without any anagrams should not be included in the result.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ ["meat" "mat" "team" "mate" "eat"]) #{#{"meat" "team" "mate"}}))
    (assert (= (__ ["veer" "lake" "item" "kale" "mite" "ever"]) #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}))))

(defn p78
  "
  Reimplement Trampoline
  Reimplement the function described in 
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (letfn [(triple [x] #(sub-two (* 3 x))) (sub-two [x] #(stop?(- x 2))) (stop? [x] (if (> x 50) x #(triple x)))] (__ triple 2)) 82))
    (assert (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x)))) (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))] (map (partial __ my-even?) (range 6))) [true false true false true false]))))

(defn p79
  "
  Triangle Minimal Path
  Write a function which calculates the sum of the minimal path through a triangle.  The triangle is represented as a collection of vectors.  The path should start at the top of the triangle and move to an adjacent number on the next row until the bottom of the triangle is reached.
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= 7 (__ '([1] [2 4] [5 1 4] [2 3 4 5])))) ; 1->2->1->3
    (assert (= 20 (__ '([3] [2 4] [1 9 3] [9 9 2 4] [4 6 6 7 8] [5 7 3 5 1 4])))))) ; 3->4->3->2->7->1

(defn p80
  "
  Perfect Numbers
  A number is "perfect" if the sum of its divisors equal the number itself.  6 is a perfect number because 1+2+3=6.  Write a function which returns true for perfect numbers and false otherwise.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 6) true))
    (assert (= (__ 7) false))
    (assert (= (__ 496) true))
    (assert (= (__ 500) false))
    (assert (= (__ 8128) true))))

(defn p81
  "
  Set Intersection
  Write a function which returns the intersection of two sets.  The intersection is the sub-set of items that each set has in common.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3}))
    (assert (= (__ #{0 1 2} #{3 4 5}) #{}))
    (assert (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d}))))

(defn p82
  "
  Word Chains
  A word chain consists of a set of words ordered so that each word differs by only one letter from the words directly before and after it.  The one letter difference can be either an insertion, a deletion, or a substitution.  Here is an example word chain:
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= true (__ #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})))
    (assert (= false (__ #{"cot" "hot" "bat" "fat"})))
    (assert (= false (__ #{"to" "top" "stop" "tops" "toss"})))
    (assert (= true (__ #{"spout" "do" "pot" "pout" "spot" "dot"})))
    (assert (= true (__ #{"share" "hares" "shares" "hare" "are"})))
    (assert (= false (__ #{"share" "hares" "hare" "are"})))))

(defn p83
  "
  A Half-Truth
  Write a function which takes a variable number of booleans.  Your function should return true if some of the parameters are true, but not all of the parameters are true.  Otherwise your function should return false.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= false (__ false false)))
    (assert (= true (__ true false)))
    (assert (= false (__ true)))
    (assert (= true (__ false true false)))
    (assert (= false (__ true true true)))
    (assert (= true (__ true true true false)))))

(defn p84
  "
  Transitive Closure
  Write a function which generates the
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (let [divides #{[8 4] [9 3] [4 2] [27 9]}] (= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]})))
    (assert (let [more-legs #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}] (= (__ more-legs) #{["cat" "man"] ["cat" "snake"] ["man" "snake"] ["spider" "cat"] ["spider" "man"] ["spider" "snake"]})))
    (assert (let [progeny #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}] (= (__ progeny) #{["father" "son"] ["father" "grandson"] ["uncle" "cousin"] ["son" "grandson"]})))))

(defn p85
  "
  Power Set
  Write a function which generates the
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
    (assert (= (__ #{}) #{#{}}))
    (assert (= (__ #{1 2 3}) #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}))
    (assert (= (count (__ (into #{} (range 10)))) 1024))))

(defn p86
  "
  Happy numbers
  Happy numbers are positive integers that follow a particular formula: take each individual digit, square it, and then sum the squares to get a new number. Repeat with the new number and eventually, you might get to a number whose squared sum is 1. This is a happy number. An unhappy number (or sad number) is one that loops endlessly. Write a function that determines if a number is happy or not.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 7) true))
    (assert (= (__ 986543210) true))
    (assert (= (__ 2) false))
    (assert (= (__ 3) false))))

(defn p88
  "
  Symmetric Difference
  Write a function which returns the symmetric difference of two sets.  The symmetric difference is the set of items belonging to one but not both of the two sets.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}))
    (assert (= (__ #{:a :b :c} #{}) #{:a :b :c}))
    (assert (= (__ #{} #{4 5 6}) #{4 5 6}))
    (assert (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]}))))

(defn p89
  "
  Starting with a graph you must write a function that returns true if it is possible to make a tour of the graph in which every edge is visited exactly once.\n\nThe graph is represented by a vector of tuples, where each tuple represents a single edge.\n\nThe rules are:\n\n- You can start at any node.\n- You must visit each edge exactly once.\n- All edges are undirected.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= true (__ [[:a :b]])))
    (assert (= false (__ [[:a :a] [:b :b]])))
    (assert (= false (__ [[:a :b] [:a :b] [:a :c] [:c :a]
                          [:a :d] [:b :d] [:c :d]])))
    (assert (= true (__ [[1 2] [2 3] [3 4] [4 1]])))
    (assert (= true (__ [[:a :b] [:a :c] [:c :b] [:a :e]
                         [:b :e] [:a :d] [:b :d] [:c :e]
                         [:d :e] [:c :f] [:d :f]])))
    (assert (= false (__ [[1 2] [2 3] [2 4] [2 5]])))))

(defn p90
  "
  Cartesian Product
  Write a function which calculates the
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ #{"ace" "king" "queen"} #{"&#9824;" "&#9829;" "&#9830;" "&#9827;"}) #{["ace" "&#9824;"] ["ace" "&#9829;"] ["ace" "&#9830;"] ["ace" "&#9827;"] ["king" "&#9824;"] ["king" "&#9829;"] ["king" "&#9830;"] ["king" "&#9827;"] ["queen" "&#9824;"] ["queen" "&#9829;"] ["queen" "&#9830;"] ["queen" "&#9827;"]}))
    (assert (= (__ #{1 2 3} #{4 5}) #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
    (assert (= 300 (count (__ (into #{} (range 10)) (into #{} (range 30))))))))

(defn p91
  "
  Graph Connectivity
  Given a graph, determine whether the graph is connected. A connected graph is such that a path exists between any two given nodes.
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= true (__ #{[:a :a]})))
    (assert (= true (__ #{[:a :b]})))
    (assert (= false (__ #{[1 2] [2 3] [3 1] [4 5] [5 6] [6 4]})))
    (assert (= true (__ #{[1 2] [2 3] [3 1] [4 5] [5 6] [6 4] [3 4]})))
    (assert (= false (__ #{[:a :b] [:b :c] [:c :d] [:x :y] [:d :a] [:b :e]})))
    (assert (= true (__ #{[:a :b] [:b :c] [:c :d] [:x :y] [:d :a] [:b :e] [:x :a]})))))

(defn p92
  "
  Read Roman numerals
  Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them. Write a function to parse a Roman-numeral string and return the number it represents.

  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= 14 (__ "XIV")))
    (assert (= 827 (__ "DCCCXXVII")))
    (assert (= 3999 (__ "MMMCMXCIX")))
    (assert (= 48 (__ "XLVIII")) )))

(defn p93
  "
  Partially Flatten a Sequence
  Write a function which flattens any nested combination of sequential things (lists, vectors, etc.), but maintains the lowest level sequential items.  The result should be a sequence of sequences with only one level of nesting.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]]))
    (assert (= (__ [[[[:a :b]]] [[:c :d]] [:e :f]]) [[:a :b] [:c :d] [:e :f]]))
    (assert (= (__ '((1 2)((3 4)((((5 6))))))) '((1 2)(3 4)(5 6))))))

(defn p94
  "
  Game of Life
  The
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= (__ [" " " ## " " ## " " ## " " ## " " "]) [" " " ## " " # " " # " " ## " " "]))
    (assert (= (__ [" " " " " ### " " " " "]) [" " " # " " # " " # " " "]))
    (assert (= (__ [" " " " " ### " " ### " " " " "]) [" " " # " " # # " " # # " " # " " "]))))

(defn p95
  "
  To Tree, or not to Tree
  Write a predicate which checks whether or not a given sequence represents a
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ '(:a (:b nil nil) nil)) true))
    (assert (= (__ '(:a (:b nil nil))) false))
    (assert (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]]) true))
    (assert (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false))
    (assert (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil]) true))
    (assert (= (__ [1 [2 [3 [4 false nil] nil] nil] nil]) false))
    (assert (= (__ '(:a nil ())) false) )))

(defn p96
  "
  Beauty is Symmetry
  Let us define a binary tree as "symmetric" if the left half of the tree is the mirror image of the right half of the tree.  Write a predicate to determine whether or not a given binary tree is symmetric. (see
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ '(:a (:b nil nil) (:b nil nil))) true))
    (assert (= (__ '(:a (:b nil nil) nil)) false))
    (assert (= (__ '(:a (:b nil nil) (:c nil nil))) false))
    (assert (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]]) true))
    (assert (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]]) false))
    (assert (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [6 nil nil] nil]] nil]]) false))))

(defn p98
  "
  Equivalence Classes
  A function f defined on a domain D induces an
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ #(* % %) #{-2 -1 0 1 2}) #{#{0} #{1 -1} #{2 -2}}))
    (assert (= (__ #(rem % 3) #{0 1 2 3 4 5 }) #{#{0 3} #{1 4} #{2 5}}))
    (assert (= (__ identity #{0 1 2 3 4}) #{#{0} #{1} #{2} #{3} #{4}}))
    (assert (= (__ (constantly true) #{0 1 2 3 4}) #{#{0 1 2 3 4}}) )))

(defn p99
  "
  Product Digits
  Write a function which multiplies two numbers and returns the result as a sequence of its digits.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ 1 1) [1]))
    (assert (= (__ 99 9) [8 9 1]))
    (assert (= (__ 999 99) [9 8 9 0 1]))))

(defn p100
  "
  Least Common Multiple
  Write a function which calculates the
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (== (__ 2 3) 6))
    (assert (== (__ 5 3 7) 105))
    (assert (== (__ 1/3 2/5) 2))
    (assert (== (__ 3/4 1/6) 3/2))
    (assert (== (__ 7 5/7 2 3/5) 210))))

(defn p101
  "
  Levenshtein Distance
  Given two sequences x and y, calculate the
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= (__ "kitten" "sitting") 3))
    (assert (= (__ "closure" "clojure") (__ "clojure" "closure") 1))
    (assert (= (__ "xyx" "xyyyx") 2))
    (assert (= (__ "" "123456") 6))
    (assert (= (__ "Clojure" "Clojure") (__ "" "") (__ [] []) 0))
    (assert (= (__ [1 2 3 4] [0 2 3 4 5]) 2))
    (assert (= (__ '(:a :b :c :d) '(:a :d)) 2))
    (assert (= (__ "ttttattttctg" "tcaaccctaccat") 10))
    (assert (= (__ "gaattctaatctc" "caaacaaaaaattt") 9))))

(defn p102
  "
  intoCamelCase
  When working with java, you often need to create an object with
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ "something") "something"))
    (assert (= (__ "multi-word-key") "multiWordKey"))
    (assert (= (__ "leaveMeAlone") "leaveMeAlone"))))

(defn p103
  "
  Generating k-combinations
  Given a sequence S consisting of n elements generate all
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 1 #{4 5 6}) #{#{4} #{5} #{6}}))
    (assert (= (__ 10 #{4 5 6}) #{}))
    (assert (= (__ 2 #{0 1 2}) #{#{0 1} #{0 2} #{1 2}}))
    (assert (= (__ 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4} #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}}))
    (assert (= (__ 4 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a "abc" "efg"}}))
    (assert (= (__ 2 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a} #{[1 2 3] "abc"} #{[1 2 3] "efg"} #{:a "abc"} #{:a "efg"} #{"abc" "efg"}}))))

(defn p104
  "
  Write Roman Numerals
  This is the inverse of
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= "I" (__ 1)))
    (assert (= "XXX" (__ 30)))
    (assert (= "IV" (__ 4)))
    (assert (= "CXL" (__ 140)))
    (assert (= "DCCCXXVII" (__ 827)))
    (assert (= "MMMCMXCIX" (__ 3999)))
    (assert (= "XLVIII" (__ 48)))))

(defn p105
  "
  Identify keys and values
  Given an input sequence of keywords and numbers, create a map such that each key in the map is a keyword, and the value is a sequence of all the numbers (if any) between it and the next keyword in the sequence.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= {} (__ [])))
    (assert (= {:a [1]} (__ [:a 1])))
    (assert (= {:a [1], :b [2]} (__ [:a 1, :b 2])))
    (assert (= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4])))))

(defn p106
  "
  Number Maze
  Given a pair of numbers, the start and end point, find a path between the two using only three possible operations:
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= 1 (__ 1 1))) ; 1
    (assert (= 3 (__ 3 12))) ; 3 6 12
    (assert (= 3 (__ 12 3))) ; 12 6 3
    (assert (= 3 (__ 5 9))) ; 5 7 9
    (assert (= 9 (__ 9 2))) ; 9 18 20 10 12 6 8 4 2
    (assert (= 5 (__ 9 12))))) ; 9 11 22 24 12

(defn p107
  "
  Simple closures
  null
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= 256 ((__ 2) 16), ((__ 8) 2)))
    (assert (= [1 8 27 64] (map (__ 3) [1 2 3 4])))
    (assert (= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4])))))

(defn p108
  "
  Lazy Searching
  null
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= 3 (__ [3 4 5])))
    (assert (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
    (assert (= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13])))
    (assert (= 64 (__ (map #(* % % %) (range)) ;; perfect cubes
                      (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
                      (iterate inc 20))) ;; at least as large as 20
            )))

(defn p110
  "
  Sequence of pronunciations
  null
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= [[1 1] [2 1] [1 2 1 1]] (take 3 (__ [1]))))
    (assert (= [3 1 2 4] (first (__ [1 1 1 4 4]))))
    (assert (= [1 1 1 3 2 1 3 2 1 1] (nth (__ [1]) 6)))
    (assert (= 338 (count (nth (__ [3 2]) 15))) )))

(defn p112
  "
  Sequs Horribilis
  Create a function which takes an integer and a nested collection of integers as arguments.  Analyze the elements of the input collection and return a sequence which maintains the nested structure, and which includes all elements starting from the head whose sum is less than or equal to the input integer.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (__ 10 [1 2 [3 [4 5] 6] 7]) '(1 2 (3 (4)))))
    (assert (= (__ 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11]) '(1 2 (3 (4 (5 (6 (7))))))))
    (assert (= (__ 9 (range)) '(0 1 2 3)))
    (assert (= (__ 1 [[[[[1]]]]]) '(((((1)))))))
    (assert (= (__ 0 [1 2 [3 [4 5] 6] 7]) '()))
    (assert (= (__ 0 [0 0 [0 [0]]]) '(0 0 (0 (0)))))
    (assert (= (__ 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]]) '(-10 (1 (2 3 (4))))))))

(defn p113
  "
  Making Data Dance
  Write a function that takes a variable number of integer arguments.  If the output is coerced into a string, it should return a comma (and space) separated list of the inputs sorted smallest to largest.  If the output is coerced into a sequence, it should return a seq of unique input elements in the same order as they were entered.
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= "1, 2, 3" (str (__ 2 1 3))))
    (assert (= '(2 1 3) (seq (__ 2 1 3))))
    (assert (= '(2 1 3) (seq (__ 2 1 3 3 1 2))))
    (assert (= '(1) (seq (apply __ (repeat 5 1)))))
    (assert (= "1, 1, 1, 1, 1" (str (apply __ (repeat 5 1)))))
    (assert (and (= nil (seq (__))) (= "" (str (__)))))))

(defn p114
  "
  Global take-while
  null
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= [2 3 5 7 11 13] (__ 4 #(= 2 (mod % 3)) [2 3 5 7 11 13 17 19 23])))
    (assert (= ["this" "is" "a" "sentence"] (__ 3 #(some #{\i} %) ["this" "is" "a" "sentence" "i" "wrote"])))
    (assert (= ["this" "is"] (__ 1 #{"a"} ["this" "is" "a" "sentence" "i" "wrote"])))))

(defn p115
  "
  The Balance of N
  A balanced number is one whose component digits have the same sum on the left and right halves of the number.  Write a function which accepts an integer n, and returns true iff n is balanced.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= true (__ 11)))
    (assert (= true (__ 121)))
    (assert (= false (__ 123)))
    (assert (= true (__ 0)))
    (assert (= false (__ 88099)))
    (assert (= true (__ 89098)))
    (assert (= true (__ 89089)))
    (assert (= (take 20 (filter __ (range))) [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101]) )))

(defn p116
  "
  Prime Sandwich
  A
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= false (__ 4)))
    (assert (= true (__ 563)))
    (assert (= 1103 (nth (filter __ (range)) 15)))))

(defn p117
  "
  For Science!
  A mad scientist with tenure has created an experiment tracking mice in a maze.  Several mazes have been randomly generated, and you've been tasked with writing a program to determine the mazes in which it's possible for the mouse to reach the cheesy endpoint.  Write a function which accepts a maze in the form of a collection of rows, each row is a string where:

  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= true (__ ["M C"])))
    (assert (= false (__ ["M # C"])))
    (assert (= true (__ ["#######" "# #" "# # #" "#M # C#" "#######"])))
    (assert (= false (__ ["########" "#M # #" "# # #" "# # # #" "# # #" "# # #" "# # # #" "# # #" "# # C#" "########"])))
    (assert (= false (__ ["M " " " " " " " " ##" " #C"])))
    (assert (= true (__ ["C######" " # " " # # " " # #M" " # "])))
    (assert (= true (__ ["C# # # #" " " "# # # # " " " " # # # #" " " "# # # #M"])))))

(defn p119
  "
  Win at Tic-Tac-Toe
  null
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= (__ :x [[:o :e :e] [:o :x :o] [:x :x :e]]) #{[2 2] [0 1] [0 2]}))
    (assert (= (__ :x [[:x :o :o] [:x :x :e] [:e :o :e]]) #{[2 2] [1 2] [2 0]}))
    (assert (= (__ :x [[:x :e :x] [:o :x :o] [:e :o :e]]) #{[2 2] [0 1] [2 0]}))
    (assert (= (__ :x [[:x :x :o] [:e :e :e] [:e :e :e]]) #{}))
    (assert (= (__ :o [[:x :x :o] [:o :e :o] [:x :e :e]]) #{[2 2] [1 1]}))))

(defn p120
  "
  Sum of square of digits
  Write a function which takes a collection of integers as an argument.  Return the count of how many elements are smaller than the sum of their squared component digits.  For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= 8 (__ (range 10))))
    (assert (= 19 (__ (range 30))))
    (assert (= 50 (__ (range 100))))
    (assert (= 50 (__ (range 1000))))))

(defn p121
  "
  Universal Computation Engine
     Given a mathematical formula in prefix notation, return a function that calculates
   the value of the formula.
   The formula can contain nested calculations using the four basic
   mathematical operators, numeric constants, and symbols representing variables.
   The returned function has to accept a single parameter containing the map
   of variable names to their values.

  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= 2 ((__ '(/ a b)) '{b 8 a 16})))
    (assert (= 8 ((__ '(+ a b 2)) '{a 2 b 4})))
    (assert (= [6 0 -4] (map (__ '(* (+ 2 a) (- 10 b))) '[{a 1 b 8} {b 5 a -2} {a 2 b 11}])))
    (assert (= 1 ((__ '(/ (+ x 2) (* 3 (+ y 1)))) '{x 4 y 1})) )))

(defn p122
  "
  Read a binary number
  Convert a binary number, provided in the form of a string, to its numerical value.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= 0 (__ "0")))
    (assert (= 7 (__ "111")))
    (assert (= 8 (__ "1000")))
    (assert (= 9 (__ "1001")))
    (assert (= 255 (__ "11111111")))
    (assert (= 1365 (__ "10101010101")))
    (assert (= 65535 (__ "1111111111111111")))))

(defn p124
  "
  Analyze Reversi
  null
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= {[1 3] #{[1 2]}, [0 2] #{[1 2]}, [3 1] #{[2 1]}, [2 0] #{[2 1]}} (__ '[[e e e e] [e w b e] [e b w e] [e e e e]] 'w)))
    (assert (= {[3 2] #{[2 2]}, [3 0] #{[2 1]}, [1 0] #{[1 1]}} (__ '[[e e e e] [e w b e] [w w w e] [e e e e]] 'b)))
    (assert (= {[0 3] #{[1 2]}, [1 3] #{[1 2]}, [3 3] #{[2 2]}, [2 3] #{[2 2]}} (__ '[[e e e e] [e w b e] [w w b e] [e e b e]] 'w)))
    (assert (= {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 1] [2 2]}} (__ '[[e e w e] [b b w e] [b w w e] [b w w w]] 'b)) )))

(defn p125
  "
  Gus' Quinundrum
  Create a function of no arguments which returns a string that is an
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= (str '__) (__)))))

(defn p126
  "
  Through the Looking Class
  Enter a value which satisfies the following:
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (let [x __] (and (= (class x) x) x)))))

(defn p127
  "
  Love Triangle
  Everyone loves triangles, and it's easy to understand why&mdash;they're so wonderfully symmetric (except scalenes, they suck).

  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= 10 (__ [15 15 15 15 15])))
    ; 1111    1111
    ; 1111    *111
    ; 1111 -> **11
    ; 1111    ***1
    ; 1111    ****
    (assert (= 15 (__ [1 3 7 15 31])))
    ; 00001     0000*
    ; 00011     000**
    ; 00111 ->  00***
    ; 01111     0****
    ; 11111     *****
    (assert (= 3 (__ [3 3])))
    ; 11    *1
    ; 11 -> **
    (assert (= 4 (__ [7 3])))
    ; 111    ***
    ; 011 -> 0*1
    (assert (= 6 (__ [17 22 6 14 22])))
    ; 10001    10001
    ; 10110    101*0
    ; 00110 -> 00**0
    ; 01110    0***0
    ; 10110    10110
    (assert (= 9 (__ [18 7 14 14 6 3])))
    ; 10010    10010
    ; 00111    001*0
    ; 01110    01**0
    ; 01110 -> 0***0
    ; 00110    00**0
    ; 00011    000*1
    (assert (= nil (__ [21 10 21 10])))
    ; 10101    10101
    ; 01010    01010
    ; 10101 -> 10101
    ; 01010    01010
    (assert (= nil (__ [0 31 0 31 0])))))
; 00000    00000
; 11111    11111
; 00000 -> 00000
; 11111    11111
; 00000    00000

(defn p128
  "
  Recognize Playing Cards
  null
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= {:suit :diamond :rank 10} (__ "DQ")))
    (assert (= {:suit :heart :rank 3} (__ "H5")))
    (assert (= {:suit :club :rank 12} (__ "CA")))
    (assert (= (range 13) (map (comp :rank __ str) '[S2 S3 S4 S5 S6 S7 S8 S9 ST SJ SQ SK SA])))))

(defn p131
  "
  Sum Some Set Subsets
  Given a variable number of sets of integers, create a function which returns true iff all of the sets have a non-empty subset with an equivalent summation.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= true (__ #{-1 1 99} #{-2 2 888} #{-3 3 7777}))) ; ex. all sets have a subset which sums to zero)
    (assert (= false (__ #{1} #{2} #{3} #{4})))
    (assert (= true (__ #{1})))
    (assert (= false (__ #{1 -3 51 9} #{0} #{9 2 81 33})))
    (assert (= true (__ #{1 3 5} #{9 11 4} #{-3 12 3} #{-3 4 -2 10})))
    (assert (= false (__ #{-1 -2 -3 -4 -5 -6} #{1 2 3 4 5 6 7 8 9})))
    (assert (= true (__ #{1 3 5 7} #{2 4 6 8})))
    (assert (= true (__ #{-1 3 -5 7 -9 11 -13 15} #{1 -3 5 -7 9 -11 13 -15} #{1 -1 2 -2 4 -4 8 -8})))
    (assert (= true (__ #{-10 9 -8 7 -6 5 -4 3 -2 1} #{10 -9 8 -7 6 -5 4 -3 2 -1})))))

(defn p134
  "
  A nil key
  Write a function which, given a key and map, returns true
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (true? (__ :a {:a nil :b 2})))
    (assert (false? (__ :b {:a nil :b 2})))
    (assert (false? (__ :c {:a nil :b 2})))))

(defn p135
  "
  Infix Calculator
  Your friend Joe is always whining about Lisps using the prefix notation for math. Show him how you could easily write a function that does math using the infix notation. Is your favorite language that flexible, Joe?

Write a function that accepts a variable length mathematical expression consisting of numbers and the operations +, -, *, and /. Assume a simple calculator that does not do precedence and instead just calculates left to right.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= 7 (__ 2 + 5)))
    (assert (= 42 (__ 38 + 48 - 2 / 2)))
    (assert (= 8 (__ 10 / 2 - 1 * 2)))
    (assert (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9)))))

(defn p137
  "
  Digits and bases
  Write a function which returns a sequence of digits of a non-negative number (first argument) in numerical system with an arbitrary base (second argument). Digits should be represented with their integer values, e.g. 15 would be [1 5] in base 10, [1 1 1 1] in base 2 and [15] in base 16.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= [1 2 3 4 5 0 1] (__ 1234501 10)))
    (assert (= [0] (__ 0 11)))
    (assert (= [1 0 0 1] (__ 9 2)))
    (assert (= [1 0] (let [n (rand-int 100000)](__ n n))))
    (assert (= [16 18 5 24 15 1] (__ Integer/MAX_VALUE 42)))))

(defn p138
  "
  Squares Squared
  Create a function of two integer arguments: the start and end, respectively.  You must create a vector of strings which renders a 45&deg; rotated square of integers which are successive squares from the start point up to and including the end point.  If a number comprises multiple digits, wrap them around the shape individually.  If there are not enough digits to complete the shape, fill in the rest with asterisk characters.  The direction of the drawing should be clockwise, starting from the center of the shape and working outwards, with the initial direction being down and to the right.
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= (__ 2 2) ["2"]))
    (assert (= (__ 2 4) [" 2 " "* 4" " * "]))
    (assert (= (__ 3 81) [" 3 " "1 9" " 8 "]))
    (assert (= (__ 4 20) [" 4 " "* 1" " 6 "]))
    (assert (= (__ 2 256) [" 6 " " 5 * " "2 2 *" " 6 4 " " 1 "]))
    (assert (= (__ 10 10000) [" 0 " " 1 0 " " 0 1 0 " "* 0 0 0" " * 1 * " " * * " " * "]))))

(defn p141
  "
  Tricky card games
  null
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (let [notrump (__ nil)] (and (= {:suit :club :rank 9} (notrump [{:suit :club :rank 4} {:suit :club :rank 9}])) (= {:suit :spade :rank 2} (notrump [{:suit :spade :rank 2} {:suit :club :rank 10}])))))
    (assert (= {:suit :club :rank 10} ((__ :club) [{:suit :spade :rank 2} {:suit :club :rank 10}])))
    (assert (= {:suit :heart :rank 8} ((__ :heart) [{:suit :heart :rank 6} {:suit :heart :rank 8} {:suit :diamond :rank 10} {:suit :heart :rank 4}])))))

(defn p143
  "
  dot product
  Create a function that computes the
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= 0 (__ [0 1 0] [1 0 0])))
    (assert (= 3 (__ [1 1 1] [1 1 1])))
    (assert (= 32 (__ [1 2 3] [4 5 6])))
    (assert (= 256 (__ [2 5 6] [100 10 1])))))

(defn p144
  "
  Oscilrate
  Write an oscillating iterate: a function that takes an initial value and a variable number of functions. It should return a lazy sequence of the functions applied to the value in order, restarting from the first function after it hits the end.
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
    (assert (= (take 5 (__ 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7]))
    (assert (= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3]) )))

(defn p146
  "
  Trees into tables
  null
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ '{a {p 1, q 2} b {m 3, n 4}}) '{[a p] 1, [a q] 2 [b m] 3, [b n] 4}))
    (assert (= (__ '{[1] {a b c d} [2] {q r s t u v w x}}) '{[[1] a] b, [[1] c] d, [[2] q] r, [[2] s] t, [[2] u] v, [[2] w] x}))
    (assert (= (__ '{m {1 [a b c] 3 nil}}) '{[m 1] [a b c], [m 3] nil}))))

(defn p147
  "
  Pascal's Trapezoid
  null
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (second (__ [2 3 2])) [2 5 5 2]))
    (assert (= (take 5 (__ [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
    (assert (= (take 2 (__ [3 1 2])) [[3 1 2] [3 4 3 2]]))
    (assert (= (take 100 (__ [2 4 2])) (rest (take 101 (__ [2 2])))))))

(defn p148
  "
  The Big Divide
  null
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= 0 (__ 3 17 11)))
    (assert (= 23 (__ 10 3 5)))
    (assert (= 233168 (__ 1000 3 5)))
    (assert (= "2333333316666668" (str (__ 100000000 3 5))))
    (assert (= "110389610389889610389610" (str (__ (* 10000 10000 10000) 7 11))))
    (assert (= "1277732511922987429116" (str (__ (* 10000 10000 10000) 757 809))))
    (assert (= "4530161696788274281" (str (__ (* 10000 10000 1000) 1597 3571))))))

(defn p152
  "
  Latin Square Slicing
  null
  Difficulty: Hard
  "
  []
  (let [__ nil]
    (assert (= (__ '[[A B C D] [A C D B] [B A D C] [D C A B]]) {}))
    (assert (= (__ '[[A B C D E F] [B C D E F A] [C D E F A B] [D E F A B C] [E F A B C D] [F A B C D E]]) {6 1}))
    (assert (= (__ '[[A B C D] [B A D C] [D C B A] [C D A B]]) {4 1, 2 4}))
    (assert (= (__ '[[B D A C B] [D A B C A] [A B C A B] [B C A B C] [A D B C A]]) {3 3}))
    (assert (= (__ [ [2 4 6 3] [3 4 6 2] [6 2 4] ]) {}))
    (assert (= (__ [[1] [1 2 1 2] [2 1 2 1] [1 2 1 2] [] ]) {2 2}))
    (assert (= (__ [[3 1 2] [1 2 3 1 3 4] [2 3 1 3] ]) {3 1, 2 2}))
    (assert (= (__ [[8 6 7 3 2 5 1 4] [6 8 3 7] [7 3 8 6] [3 7 6 8 1 4 5 2] [1 8 5 2 4] [8 1 2 4 5]]) {4 1, 3 1, 2 7}))))

(defn p153
  "
  Pairwise Disjoint Sets
  null
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}}) true))
    (assert (= (__ #{#{:a :b :c :d :e} #{:a :b :c :d} #{:a :b :c} #{:a :b} #{:a}}) false))
    (assert (= (__ #{#{[1 2 3] [4 5]} #{[1 2] [3 4 5]} #{[1] [2] 3 4 5} #{1 2 [3 4] [5]}}) true))
    (assert (= (__ #{#{'a 'b} #{'c 'd 'e} #{'f 'g 'h 'i} #{''a ''c ''f}}) true))
    (assert (= (__ #{#{'(:x :y :z) '(:x :y) '(:z) '()} #{#{:x :y :z} #{:x :y} #{:z} #{}} #{'[:x :y :z] [:x :y] [:z] [] {}}}) false))
    (assert (= (__ #{#{(= "true") false} #{:yes :no} #{(class 1) 0} #{(symbol "true") 'false} #{(keyword "yes") ::no} #{(class '1) (int \0)}}) false))
    (assert (= (__ #{#{distinct?} #{#(-> %) #(-> %)} #{#(-> %) #(-> %) #(-> %)} #{#(-> %) #(-> %) #(-> %)}}) true))
    (assert (= (__ #{#{(#(-> *)) + (quote mapcat) #_ nil} #{'+ '* mapcat (comment mapcat)} #{(do) set contains? nil?} #{, , , #_, , empty?}}) false))))

(defn p156
  "
  Map Defaults
  When retrieving values from a map, you can specify default values in case the key is not found:
  Difficulty: Elementary
  "
  []
  (let [__ nil]
    (assert (= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0}))
    (assert (= (__ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"}))
    (assert (= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]}))))

(defn p157
  "
  Indexing Sequences
  Transform a sequence into a sequence of pairs containing the original elements along with their index.
  Difficulty: Easy
  "
  []
  (let [__ nil]
    (assert (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
    (assert (= (__ [0 1 3]) '((0 0) (1 1) (3 2))))
    (assert (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]]))))

(defn p158
  "
  Decurry
  Write a function that accepts a curried function of unknown arity
  Difficulty: Medium
  "
  []
  (let [__ nil]
    (assert (= 10 ((__ (fn [a] (fn [b] (fn [c] (fn [d] (+ a b c d)))))) 1 2 3 4)))
    (assert (= 24 ((__ (fn [a] (fn [b] (fn [c] (fn [d] (* a b c d)))))) 1 2 3 4)))
    (assert (= 25 ((__ (fn [a] (fn [b] (* a b)))) 5 5)) )))
