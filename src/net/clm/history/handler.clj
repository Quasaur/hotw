(ns net.clm.history.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as jetty]
            [net.clm.history.pages.pgIndex :as pgIndex])
    (:gen-class))


(defroutes app-routes
  (GET "/" [] (pgIndex/page))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app (handler/site app-routes))

(defn -main
      [& [port]]
      (let [port (Integer. (or port
                               (System/getenv "PORT")
                               3000))]
           (jetty/run-jetty #'app {:port  port
                                   :join? false})))