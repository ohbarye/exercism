(ns word-count
  (require [clojure.string :refer [lower-case split]]))

(defn split-by-delmiter [arg]
  (map lower-case (split arg #"[^A-Za-z0-9]+")))

(defn count-by-word [m v]
  (assoc m v (+ 1 (if (m v) (m v) 0))))

(defn word-count [arg]
  (reduce count-by-word {} (split-by-delmiter arg)))
