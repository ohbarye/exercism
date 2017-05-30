(ns hello-world)

(defn hello
  ([] (hello "World"))
  ([arg] (println (str "Hello, " arg "!"))))
