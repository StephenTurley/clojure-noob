(ns clojure-noob.map)

(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))

(defn stats
  "an example of mapping functions through a function"
  [numbers]
  (zipmap [:count :sum :average]
          (map #(% numbers) [count sum avg])))
