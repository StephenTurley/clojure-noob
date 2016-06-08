(ns clojure-noob.map-spec
  (:require
    [speclj.core :refer :all]
    [clojure-noob.map :as underTest :refer :all]))

(describe "sum"
  (it "sum a collection with single value"
    (should= 1 (underTest/sum [1])))

  (it "sum a collection with two or more values"
    (should= 2 (underTest/sum [1 1]))
    (should= 5 (underTest/sum [1 2 2]))))

(run-specs)