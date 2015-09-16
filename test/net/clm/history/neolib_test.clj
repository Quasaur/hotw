(ns net.clm.history.neolib_test
  (:require [clojure.test :refer :all]
            [clojurewerkz.neocons.rest :as nr]))

(deftest test-connect
  (testing "connect-params"
    ((let [result (nr/connect "http://neo4j:$timMons000@localhost:7474/db/data/")]
       (is (= result "{:endpoint #clojurewerkz.neocons.rest.Neo4JEndpoint{:version \"2.2.5\", :node-uri \"http://localhost:7474/db/data/node\", :relationships-uri \"http://neo4j:$timMons000@localhost:7474/db/data/relationship\", :node-index-uri \"http://localhost:7474/db/data/index/node\", :relationship-index-uri \"http://localhost:7474/db/data/index/relationship\", :relationship-types-uri \"http://localhost:7474/db/data/relationship/types\", :batch-uri \"http://localhost:7474/db/data/batch\", :extensions-info-uri \"http://localhost:7474/db/data/ext\", :extensions {}, :reference-node-uri nil, :uri \"http://neo4j:$timmons000@localhost:7474/db/data/\", :cypher-uri \"http://localhost:7474/db/data/cypher\", :transaction-uri \"http://localhost:7474/db/data/transaction\"}, :http-auth {:basic-auth [\"neo4j\" \"$timMons000\"]}, :options {:headers {\"User-Agent\" \"neocons.clj/3.1.0-beta3\"}}}"))))))
