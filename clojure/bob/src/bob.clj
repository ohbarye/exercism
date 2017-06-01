(ns bob
  (require [clojure.string :refer [blank? upper-case lower-case ends-with?]]))

(defn yell? [message]
  (and (= message (upper-case message)) (not= message (lower-case message))))

(defn question? [message]
  (ends-with? message "?"))

(defn response-for [message]
  (cond
    (blank? message) "Fine. Be that way!"
    (yell? message) "Whoa, chill out!"
    (question? message) "Sure."
    :else "Whatever.")
)
