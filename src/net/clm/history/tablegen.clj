(ns ^{:author "Calvin L. Mitchell"
      :doc "Routines to turn the Neo4j JSON data into an HTML5 table."}
    net.clm.history.tablegen)

(defn- neo2map [ejsondata])

(defn- ehiccup [events-neomap])

(defn events-hiccup [njson-data]
  (let [eneo4map (neo2map njson-data)]
    (ehiccup eneo4map)))
