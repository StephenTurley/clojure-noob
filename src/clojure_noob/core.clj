(ns clojure-noob.core
  (:require [clojure-noob.map])
  (:gen-class))

(defn -main
  [& args]
  (println "Mapping functions through functions, wow: " (clojure-noob.map/stats [1 3 5 0 3])))


