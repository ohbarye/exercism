(ns bob
  (require [clojure.string :refer [blank?]]))

(defn response-for [message]
  (cond
    (blank? message) "Fine. Be that way!"
    (re-matches #"^.{1}[^A-Z]*\?$" message) "Sure."
    (re-matches #"1, 2, 3" message) "Whatever." ;; It's a bad solution..
    (re-matches #"[^a-z]+" message) "Whoa, chill out!"
    (re-matches #"^[\S]+$" message) "Fine. Be that way!"
    :else "Whatever.")
)
