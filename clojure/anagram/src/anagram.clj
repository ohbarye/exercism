(ns anagram
  (require [clojure.string :refer [split join lower-case]]))

(defn normalize [word]
  (join
    (sort
      (split
        (lower-case word)
        #""))))

(defn same? [x y]
  (= (lower-case x)
     (lower-case y)))

(defn anagram? [x y]
  (and (= (normalize x) (normalize y))
       (not (same? x y))))

(defn anagrams-for [word candidates]
  (filter
    #(anagram? word %)
    candidates))
