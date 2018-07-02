(ns llist.core-test
  (:require [clojure.test :refer :all]
            [llist.core :refer :all]))

(deftest empty-list
  (let [l0 (lempty)]
    (is (= true (lempty? l0)))
    (is (= 0 (llen l0)))
    (is (= nil (lfirst l0)))  ; !!! Well, Clojure's `first` does this!
    (is (= nil (lnext l0)))))

(deftest singleton
  (let [l1 (lcons 11 (lempty))]
    (is (= false (lempty? l1)))
    (is (= 1 (llen l1)))
    (is (= 11 (lfirst l1)))
    (is (= (lempty) (lnext l1)))))

(deftest doublet
  (let [l1 (lcons 12 (lempty))
        l2 (lcons 22 l1)]
    (is (= false (lempty? l2)))
    (is (= 2 (llen l2)))
    (is (= 22 (lfirst l2)))
    (is (= l1 (lnext l2)))))
