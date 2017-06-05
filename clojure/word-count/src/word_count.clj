(ns word-count
  (require [clojure.string :refer [lower-case split]]))

(defn split-by-delmiter [arg]
  (map lower-case (split arg #"[^A-Za-z0-9]+")))

(defn word-count [arg]
  (frequencies (split-by-delmiter arg)))
