(ns net.clm.history.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as jetty]
            [net.clm.history.pages.pgIndex :as pgIndex]
            [net.clm.history.pages.pgAdd :as pgAdd]
            [net.clm.history.pages.pgMap :as pgMap]
            [net.clm.history.pages.pgChart :as pgChart]
            [net.clm.history.pages.pgLearn :as pgLearn]
            [net.clm.history.pages.pgChange :as pgChange]
            [net.clm.history.pages.pgSeek :as pgSeek])
    (:gen-class))


(defroutes app-routes
  "defroutes macro for compojure routes."
  (GET "/" [] (pgIndex/page))
  (GET "/add" [] (pgAdd/page))
  (GET "/map" [] (pgMap/page))
  (GET "/chart" [] (pgChart/page))
  (GET "/learn" [] (pgLearn/page))
  (GET "/change" [] (pgChange/page))
  (GET "/seek" [] (pgSeek/page))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app "Global def for compojure app" (handler/site app-routes))

(defn -main
  "Main entry point for History of the World web app.
  Argument(s):
  & port: port number of the ring server (defaults to 3000."
      [& [port]]
      (let [port (Integer. (or port
                               (System/getenv "PORT")
                               3000))]
           (jetty/run-jetty #'app {:port  port
                                   :join? false})))