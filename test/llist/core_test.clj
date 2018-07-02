(ns llist.core-test
  (:require [clojure.test :refer :all]
            [llist.core :refer :all]))

(deftest empty-list
  (let [l0 (lempty)]
    (is (= true (lempty? l0)))
    (is (= 0 (llen l0)))))

(deftest singleton
  (let [l1 (lcons 11 (lempty))]
    (is (= false (lempty? l1)))
    (is (= 1 (llen l1)))))

(deftest doublet
  (let [l2 (lcons 22 (lcons 12 (lempty)))]
    (is (= false (lempty? l2)))
    #_(is (= 2 (llen l2)))))

(deftest lempty-test
    (let [l0 (lempty)
          l1 (lcons 1 l0)
          l2 (lcons 1 l1)]
      (is (= 2 (lrest [1 2 3])))
      #_(is (= [2 3] (lrest2 [1 2 3])))
      #_;(is (= [3] (lrest3 [1 2 3])))
      (is (= (lempty) (lrest l1)))
      (is (= (lcons 1 (lempty)) (lrest l2)))
      #_(is (= 3 (llen (lcons 1 l2))))
            ))


