(ns kami_app-test
  (:require [clojure.test :refer [deftest is testing]]
            [kami_app]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (the-ns 'kami_app)))))
