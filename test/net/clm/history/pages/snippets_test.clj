(ns net.clm.history.pages.snippets-test
    (:require [clojure.test :refer :all]
      [net.clm.history.pages.snippets :refer :all]))

(deftest test-cssfiles
  (testing "cssfiles-params"
    ((let [result (cssfiles "index")]
      (is (= result "PRGMR. MSG: net.clm.history.pages.snippets.clj::(defn cssfiles [index]): unknown parameter or parameter not processed properly."))
      (is (= result "<link href=\"/css/hcspry.css\" rel=\"stylesheet\" type=\"text/css\"><link href=\"/css/menus.css\" rel=\"stylesheet\" type=\"text/css\"><link href=\"/css/filter.css\" rel=\"stylesheet\" type=\"text/css\"><link href=\"/css/wc3xhtml1.css\" rel=\"stylesheet\" type=\"text/css\">"))
          ))))
