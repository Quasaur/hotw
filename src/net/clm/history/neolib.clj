(ns ^{:author "Calvin L. Mitchell"
      :doc "Routines for interacting with the History of the World Neo4j database."}
    net.clm.history.neolib
  (:require [clojurewerkz.neocons.rest :as rest]
            [clojurewerkz.neocons.rest.batch :as batch]
            [clojurewerkz.neocons.rest.conversion :as conv]
            [clojurewerkz.neocons.rest.cypher :as cypher]
            [clojurewerkz.neocons.rest.index :as index]
            [clojurewerkz.neocons.rest.nodes :as nodes]
            [clojurewerkz.neocons.rest.paths :as paths]
            [clojurewerkz.neocons.rest.records :as recs]
            [clojurewerkz.neocons.rest.relationships :as nrels]
            [clojurewerkz.neocons.rest.spatial :as spatial]
            [clojurewerkz.neocons.rest.labels :as labels]
            [clojurewerkz.neocons.rest.constraints :as cstr]
            [clojurewerkz.neocons.rest.transaction :as trans]))


(defn get-json-events []
  (let [conn (rest/connect "http://neo4j:$timMons000@localhost:7474/db/data")
        json-events (cypher/tquery conn "match (n:Event) return id(n), labels(n), n.Caption, n.Bible, n.EndBible, n.Gregorian, n.EndGregorian, n.Description")]
    json-events))