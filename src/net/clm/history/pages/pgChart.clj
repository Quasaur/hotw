(ns net.clm.history.pages.pgChart
  (:require [hiccup.core :as hcore]
            [hiccup.page :as hic]
            [net.clm.history.pages.snippets :as snippets]
            [net.clm.history.pages.menus :as menu]))

(defn pageContent []
  (list
    [:div {:id "timeline"}
     [:div {:class "timeline-default", :id "tl", :style "height: 650px; border: 1px solid #aaa; font-size:10pt"}]
     [:div {:style "width: 100%"}
      [:table {:style "text-align: center; width: 100%"}
       [:tr
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-11000);"} "11000 BC"]]
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-8000);"} "8000 BC"]]
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-6000);"} "6000 BC"]]
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-4000);"} "4000 BC"]]
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-2000);"} "2000 BC"]]
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-100);"} "100 BC"]]
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(2000);"} "2000 AD"]]
        [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(4000);"} "4000 AD"]]]]]
     [:div {:class "controls", :id "controls"}]]))

(defn page
  "SIMILE Timeline Chart Page for History of the World.
  Argument(s): NONE"
  []
  (hcore/html
    (hic/html5 {:lang "en"}
               (snippets/head "chart" "Dot Net II: History of the World: Browse")
               [:body {:onload "onLoad();", :onresize "onResize();"}
                [:div {:class "container"}
                 ;; Load the Bootstrap 3 responsive menu
                 (menu/playmenu "chart")
                 [:div {:class "row", :id "contentRow datascroll"}
                  [:div {:class "col-md-12"}
                   (pageContent)]]
                 [:div {:class "row", :id "footerRow"}
                  [:div {:class "col-md-6"} (snippets/statuspanel)]
                  [:div {:class "col-md-6"} (snippets/socialmediapanel)]]
                 (snippets/loadjsscripts "chart")]])))
