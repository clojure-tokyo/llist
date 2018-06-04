(ns llist.core-test
  (:require [clojure.test :refer :all]
            [llist.core :refer :all]))

#_(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest lempty-test
  (testing "lempty"
    (let [l0 (lempty)
          l1 (lcons 1 l0)
          l2 (lcons 1 l1)]
      (is (= true (lempty? l0)))
      (is (= 0 (llen l0)))
      (is (= false (lempty? l1)))
      (is (= 1 (llen l1)))
      (is (= 2 (lrest [1 2 3])))
      ;(is (= [2 3] (lrest2 [1 2 3])))
      ;(is (= [3] (lrest3 [1 2 3])))
      (is (= (lempty) (lrest l1)))
      (is (= (lcons 1 (lempty)) (lrest l2)))
      #_(is (= 2 (llen (lcons 1 l1))))
      #_(is (= 3 (llen (lcons 1 l2))))
            )))


