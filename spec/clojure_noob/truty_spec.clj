(ns clojure-noob.truty-spec
  (:require [speclj.core :refer :all]))

(defn truthy?
  [thing]
  (if thing
     :its-true
     :its-false))

(describe "and"
  (it "returns last value when all are truthy"
    (should= :derp (and :flerp :derp)))
  (it "returns first falsy value"
    (should= nil (and :flerp nil :derp))))

(describe "truthyness"
  (it "returns true for an empty vector"
      (should= :its-true (truthy? [])))
  (it "returns true for zero"
      (should= :its-true (truthy? 0)))
  (it "returns true for an empty list"
      (should= :its-true (truthy? '())))
  (it "returns true for an empty string"
      (should= :its-true (truthy? "")))
  (it "returns false for nil"
      (should= :its-false (truthy? nil)))
  (it "returns false for false"
      (should= :its-false (truthy? false))))

(run-specs)
