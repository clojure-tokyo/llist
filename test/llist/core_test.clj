(ns llist.core-test
  (:require [clojure.test :refer :all]
            [llist.core :refer :all]))

(deftest empty-list-test
  (let [l0 (lempty)]
    (is (= true (lempty? l0)))
    (is (= 0 (llen l0)))
    (is (= nil (lfirst l0)))  ; !!! Well, Clojure's `first` does this!
    (is (= nil (lnext l0)))))

(deftest singleton-test
  (let [l1 (lcons 11 (lempty))]
    (is (= false (lempty? l1)))
    (is (= 1 (llen l1)))
    (is (= 11 (lfirst l1)))
    (is (= (lempty) (lnext l1)))))

(deftest doublet-test
  (let [l1 (lcons 12 (lempty))
        l2 (lcons 22 l1)]
    (is (= false (lempty? l2)))
    (is (= 2 (llen l2)))
    (is (= 22 (lfirst l2)))
    (is (= l1 (lnext l2)))))

(deftest lrepeat0-test
  (let [l0 (lrepeat 0 17)]
    (is (= 0 (llen l0)))
    (is (= (lempty) l0))))

(deftest lrepeat-test
  (let [l3 (lrepeat 3 17)
        l3-expected (lcons 17 (lcons 17 (lcons 17 (lempty))))]
    (is (= 3 (llen l3)))
    (is (= l3-expected l3))))

(deftest lrepeatbig-test
  (is (= 1000000 (llen (lrepeat 1000000 1)))))
