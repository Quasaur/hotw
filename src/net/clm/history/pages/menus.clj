(ns net.clm.history.pages.menus
  (:require [hiccup.page :as hic]))

(def liBrowse (list [:li [:a {:shape "rect", :href "/"} "Browse"]]))
(def liBrowseActive (list [:li {:class "active"} [:a {:shape "rect", :href "#"} "Browse"]]))
(def liAdd (list [:li [:a {:shape "rect", :href "/add"} "Add"]]))
(def liAddActive (list [:li {:class "active"} [:a {:shape "rect", :href "#"} "Add"]]))
(def liMap (list [:li [:a {:shape "rect", :href "/map"} "Map"]]))
(def liMapActive (list [:li {:class "active"} [:a {:shape "rect", :href "#"} "Map"]]))
(def liChart (list [:li [:a {:shape "rect", :href "/chart"} "Chart"]]))
(def liChartActive (list [:li {:class "active"} [:a {:shape "rect", :href "#"} "Chart"]]))
(def liLearn (list [:li [:a {:shape "rect", :href "/learn"} "Learn"]]))
(def liLearnActive (list [:li {:class "active"} [:a {:shape "rect", :href "#"} "Learn"]]))
(def liChanges (list [:li [:a {:shape "rect", :href "/change"} "Change"]]))
(def liChangesActive (list [:li {:class "active"} [:a {:shape "rect", :href "#"} "Changes"]]))
(def liSeek (list [:li [:a {:shape "rect", :href "/seek"} "Seek"]]))
(def liSeekActive (list [:li {:class "active"} [:a {:shape "rect", :href "#"} "Seek"]]))


(defn playmenu
  "Implement the Bootstrap 3 Responsive Menu based on the page being displayed.
  Arguments: pageName"
  [pageName]
  [:nav {:id "pageNavBar", :class "navbar navbar-default"}
   [:div {:class "container-fluid"}
    [:div {:class "navbar-header"}
     [:button {:type "button", :class "navbar-toggle collapsed", :data-toggle "collapse", :data-target "#navbar"}
      [:span {:class "sr-only"} "Toggle navigation"]
      [:span {:class "icon-bar"}]
      [:span {:class "icon-bar"}]
      [:span {:class "icon-bar"}]]
     [:a {:shape "rect", :class "navbar-brand", :href "#", :style "color: white;"} [:strong "History of the World"]]]
    [:div {:class "navbar-collapse collapse", :id "navbar"}
     [:ul {:class "nav navbar-nav", :id "menuItems"}
      (condp = pageName
        "index" (concat liBrowseActive liAdd liMap liChart liLearn liChanges liSeek)
        "add" (concat liBrowse liAddActive liMap liChart liLearn liChanges liSeek)
        "map" (concat liBrowse liAdd liMapActive liChart liLearn liChanges liSeek)
        "chart" (concat liBrowse liAdd liMap liChartActive liLearn liChanges liSeek)
        "learn" (concat liBrowse liAdd liMap liChart liLearnActive liChanges liSeek)
        "change" (concat liBrowse liAdd liMap liChart liLearn liChangesActive liSeek)
        "seek" (concat liBrowse liAdd liMap liChart liLearn liChanges liSeekActive)
        (println (str  "PRGMR. MSG: net.clm.history.pages.menus.clj::(defn playmenu [" pageName "]): unknown parameter or parameter not processed properly.")))
      ]]]])
