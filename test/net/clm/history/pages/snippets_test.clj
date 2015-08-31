(ns net.clm.history.pages.snippets-test
    (:require [clojure.test :refer :all]
      [net.clm.history.pages.snippets :refer :all]))

(deftest test-cssfiles
  (testing "cssfiles-params"
    ((let [result (cssfiles "index")]
      (is (= result "PRGMR. MSG: net.clm.history.pages.snippets.clj::(defn cssfiles [index]): unknown parameter or parameter not processed properly."))
      (is (= result "<link href=\"/_oldcss/hcspry._oldcss\" rel=\"stylesheet\" type=\"text/_oldcss\"><link href=\"/_oldcss/menus._oldcss\" rel=\"stylesheet\" type=\"text/_oldcss\"><link href=\"/_oldcss/filter._oldcss\" rel=\"stylesheet\" type=\"text/_oldcss\"><link href=\"/_oldcss/wc3xhtml1._oldcss\" rel=\"stylesheet\" type=\"text/_oldcss\">"))
          ))))
