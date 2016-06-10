(ns clojure-noob.truty-spec
  (:require [speclj.core :refer :all]))

(defn truthy?
  [thing]
  (if thing
     :its-true
     :its-false))

(describe "truthyness"
  (context "truthy"
    (it "returns true for an empty vector"
        (should= :its-true (truthy? [])))
    (it "returns true for zero"
        (should= :its-true (truthy? 0)))
    (it "returns true for an empty list"
        (should= :its-true (truthy? '())))
    (it "returns true for an empty string"
        (should= :its-true (truthy? ""))))
  (context "falsy"
     (it "returns false for nil"
         (should= :its-false (truthy? nil)))
     (it "returns false for false"
         (should= :its-false (truthy? false)))
     (it "returns false for an empty sequence"
         (should= :its-false (truthy? (seq ()))))))

(describe "and"
  (it "returns last value when all are truthy"
    (should= :derp (and :flerp :derp)))
  (it "returns first falsy value"
    (should= nil (and :flerp nil :derp))))

(describe "or"
  (it "returns the first true value"
      (should= :derp (or nil nil :derp)))
  (it "returns the last false falue"
      (should= nil (or false false nil))))


(run-specs)
