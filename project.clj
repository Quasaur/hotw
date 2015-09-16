(defproject net.clm.history "1.1.4"
  :main net.clm.history.handler
  :aot [net.clm.history.handler]
  :description "A rewrite of my History of the World in Clojure"
  :url "http://history.clmitchell.net"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [clojurewerkz/neocons "3.1.0-rc1"]]
  :plugins [[lein-ring "0.9.6"]
            [codox "0.8.13"]]
  :ring {:handler net.clm.history.handler/app
         :host "localhost"}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
