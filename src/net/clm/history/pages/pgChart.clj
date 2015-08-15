(ns net.clm.history.pages.pgChart
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]))


(defn page
  "Timeline Chart Page for History of the World.
  Argument(s): NONE"
  []
  (hcore/html
    (hic/html5
      (snippets/head "chart" "Dot Net II: History of the World: Chart")
      [:body {:onload "onLoad();", :onresize "onResize();"}
       [:h1 {:class "title"} "History of the World"]
       [:div {:id "tabsF"} (snippets/tabsf)]
       (snippets/timelinediv)
       [:div {:class "controls", :id "controls"}]])))
