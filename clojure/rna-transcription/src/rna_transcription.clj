(ns rna-transcription
  (require [clojure.string :refer [split join]]))

(def dict {"C" "G", "G" "C", "A" "U", "T" "A"})

(def dna-pattern
  (re-pattern (str "^[" (join (keys dict)) "]+$")))

(defn validate-dna [strand]
  (assert (re-matches dna-pattern strand)))

(defn to-rna [arg]
  (validate-dna arg)
  (join
    (map #(get dict %) (split arg #""))))
