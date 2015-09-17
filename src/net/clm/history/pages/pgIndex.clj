(ns net.clm.history.pages.pgIndex
  (:require [hiccup.core :as hcore]
            [hiccup.page :as hic]
            [net.clm.history.pages.snippets :as snippets]
            [net.clm.history.pages.menus :as menus]
            [net.clm.history.neolib :as neo]
            [net.clm.history.pages.menus :as menus]
            [net.clm.history.neolib :as nlib]
            [net.clm.history.tablegen :as tg]))

(defn pctabs []
  [:ul {:class "nav nav-tabs", :role "tablist", :style "background-color: lightgrey;"}
   [:li {:class "active"} [:a {:shape "rect", :id "tab-1", :href "#one", :role "tab", :data-toggle "tab"} "Events"]]
   [:li [:a {:shape "rect", :id "tab-2", :href "#two", :role "tab", :data-toggle "tab"} "People"]]
   [:li [:a {:shape "rect", :id "tab-2", :href "#three", :role "tab", :data-toggle "tab"} "Places"]]
   [:li [:a {:shape "rect", :id "tab-3", :href "#four", :role "tab", :data-toggle "tab"} "Relationships"]]])

(defn table-events-data []
  (let [events-nv (nlib/get-nvect-events)]
    events-nv))


(def tattrs {:table-attrs {:class "cel-border stripe" :id "tblEvents"}})

(defn table-events
  "Create the Events Table for the History of the World Index/Browse Page from the Neo4j database.
  Argument(s): NONE"
  []
  (tg/to-table1d (table-events-data) [0 "ID" 1 "Labels" 2 "Caption" 3 "Place" 4 "Bible Start" 5 "Bible End" 6 "Greg. Start" 7 "Gre. End" 8 "Notes"] tattrs))

(defn table-people []
  [:table {:class "cell-border stripe", :id "tblPeople"}
   [:thead
    [:tr
     [:th {:colspan "4"}]
     [:th {:colspan "2" :class "dt-head-center"} "Place"]
     [:th {:colspan "2" :class "dt-head-center"} "Parents"]
     [:th {:colspan "1"}]
     [:th {:colspan "2" :class "dt-head-center"} "Bible"]
     [:th {:colspan "2" :class "dt-head-center"} "Gregorian"]
     [:th {:colspan "1"}]]
    [:tr
     [:th {:class "cid"} "ID"]
     [:th {:class "clabels"} "Labels"]
     [:th {:class "cname"} "Name"]
     [:th {:class "ccaption"} "Caption"]
     [:th {:class "cbirth"} "...of Birth"]
     [:th {:class "cdeath"} "...of Death"]
     [:th {:class "cdata"} "Father"]
     [:th {:class "cmom"} "Mother"]
     [:th {:class "ctype"} "Type"]
     [:th {:class "cbstart"} "Start"]
     [:th {:class "cbend"} "End"]
     [:th {:class "cgstart"} "Start"]
     [:th {:class "cgend"} "End"]
     [:th {:class "cnotes"} "Notes"]]]
   [:tbody
    [:tr
     [:td "5"]
     [:td "GOD:Person:Spirit"]
     [:td "YHWH"]
     [:td "YHWH"]
     [:td "Africa"]
     [:td "Middle East"]
     [:td "NONE"]
     [:td "NONE"]
     [:td "Spirit"]
     [:td "0"]
     [:td "0"]
     [:td "0"]
     [:td "0"]
     [:td "YHWH, the Creator of all things, with no beginning and no end."]]
    [:tr
     [:td "8"]
     [:td "Adam:Person:Human:Male"]
     [:td "Adam_Ben_YHWH"]
     [:td "Adam Ben YHWH"]
     [:td "Africa"]
     [:td "Middle East"]
     [:td "NONE"]
     [:td "GOD"]
     [:td "Male"]
     [:td "1"]
     [:td "930"]
     [:td "-10974"]
     [:td "-10044"]
     [:td "Adam, the First Human, lives for 930 years."]]
    [:tr
     [:td "10"]
     [:td "Eve:Person:Human:Female"]
     [:td "Eve_Isha_Adam"]
     [:td "Eve Isha Adam"]
     [:td "Africa"]
     [:td "Middle East"]
     [:td "NONE"]
     [:td "GOD"]
     [:td "Female"]
     [:td "1"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td "-10974"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td "Eve, the Mother of all humanity, has no length of years listed."]]
    [:tr
     [:td "11"]
     [:td "Seth:Person:Human:Male"]
     [:td "Seth_Ben_Adam"]
     [:td "Seth Ben Adam"]
     [:td "Middle East"]
     [:td "Middle East"]
     [:td "Adam"]
     [:td "Eve"]
     [:td "Male"]
     [:td "130"]
     [:td "1042"]
     [:td "-10846"]
     [:td "-9934"]
     [:td "Seth, Adam's third recorded son, lives for 912 years."]]
    [:tr
     [:td "13"]
     [:td "Enos:Person:Human:Male"]
     [:td "Enos_Ben_Seth"]
     [:td "Enos Ben Seth"]
     [:td "Middle East"]
     [:td "Middle East"]
     [:td "Seth"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td "Male"]
     [:td "234"]
     [:td "1139"]
     [:td "-10741"]
     [:td "-9839"]
     [:td "Enos lives for 905 years."]]
    [:tr
     [:td "19"]
     [:td "Cainan:Person:Human:Male"]
     [:td "Cainan_Ben_Enos"]
     [:td "Cainan Ben Enos"]
     [:td "Middle East"]
     [:td "Middle East"]
     [:td "Enos"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td "Male"]
     [:td "1139"]
     [:td "2044"]
     [:td "-9838"]
     [:td "-8930"]
     [:td "Cainan lives for 910 years."]]
    [:tr
     [:td "105"]
     [:td "GOD:Person:Spirit"]
     [:td "YHWH"]
     [:td "YHWH"]
     [:td "Africa"]
     [:td "Middle East"]
     [:td "NONE"]
     [:td "NONE"]
     [:td "Spirit"]
     [:td "0"]
     [:td "0"]
     [:td "0"]
     [:td "0"]
     [:td "YHWH, the Creator of all things, with no beginning and no end."]]
    [:tr
     [:td "2008"]
     [:td "Adam:Person:Human:Male"]
     [:td "Adam_Ben_YHWH"]
     [:td "Adam Ben YHWH"]
     [:td "Africa"]
     [:td "Middle East"]
     [:td "NONE"]
     [:td "GOD"]
     [:td "Male"]
     [:td "1"]
     [:td "930"]
     [:td "-10974"]
     [:td "-10044"]
     [:td "Adam, the First Human, lives for 930 years."]]
    [:tr
     [:td "30010"]
     [:td "Eve:Person:Human:Female"]
     [:td "Eve_Isha_Adam"]
     [:td "Eve Isha Adam"]
     [:td "Africa"]
     [:td "Middle East"]
     [:td "NONE"]
     [:td "GOD"]
     [:td "Female"]
     [:td "1"]
     [:td ]
     [:td "-10974"]
     [:td ]
     [:td "Eve, the Mother of all humanity, has no length of years listed."]]
    [:tr
     [:td "400011"]
     [:td "Seth:Person:Human:Male"]
     [:td "Seth_Ben_Adam"]
     [:td "Seth Ben Adam"]
     [:td "Middle East"]
     [:td "Middle East"]
     [:td "Adam"]
     [:td "Eve"]
     [:td "Male"]
     [:td "130"]
     [:td "1042"]
     [:td "-10846"]
     [:td "-9934"]
     [:td "Seth, Adam's third recorded son, lives for 912 years."]]
    [:tr
     [:td "5000013"]
     [:td "Enos:Person:Human:Male"]
     [:td "Enos_Ben_Seth"]
     [:td "Enos Ben Seth"]
     [:td "Middle East"]
     [:td "Middle East"]
     [:td "Seth"]
     [:td ]
     [:td "Male"]
     [:td "234"]
     [:td "1139"]
     [:td "-10741"]
     [:td "-9839"]
     [:td "Enos lives for 905 years."]]
    [:tr
     [:td "60000019"]
     [:td "Cainan:Person:Human:Male"]
     [:td "Cainan_Ben_Enos"]
     [:td "Cainan Ben Enos"]
     [:td "Middle East"]
     [:td "Middle East"]
     [:td "Enos"]
     [:td ]
     [:td "Male"]
     [:td "1139"]
     [:td "2044"]
     [:td "-9838"]
     [:td "-8930"]
     [:td "Cainan lives for 910 years."]]]])

(defn table-places []
  (list
    [:table {:class "cell-border stripe", :id "tblPlaces"}
     [:thead
      [:tr
       [:th {:class "cid"} "ID"]
       [:th {:class "clabels"} "Labels"]
       [:th {:class "cname"} "Name"]
       [:th {:class "ccaption"} "Caption"]]]
     [:tbody
      [:tr
       [:td "1"]
       [:td "Earth:Planet:Place"]
       [:td "Earth"]
       [:td "Earth"]]
      [:tr
       [:td "2"]
       [:td "Sol:Star:Place"]
       [:td "Sol"]
       [:td "Sol"]]
      [:tr
       [:td "3"]
       [:td "Milky_Way:Galaxy:Place"]
       [:td "Milky_Way"]
       [:td "Milky Way"]]
      [:tr
       [:td "4"]
       [:td "Universe:Place"]
       [:td "Universe"]
       [:td "Universe"]]
      [:tr
       [:td "5"]
       [:td "GOD:Person:Place:Spirit"]
       [:td "YHWH"]
       [:td "YHWH"]]
      [:tr
       [:td "7"]
       [:td "Africa:Continent:Place"]
       [:td "Africa"]
       [:td "Africa"]]
      [:tr
       [:td "9"]
       [:td "Middle_East:Continent:Place"]
       [:td "Middle_East"]
       [:td "Middle East"]]
      [:tr
       [:td "13"]
       [:td "Egypt:Country:Place"]
       [:td "Egypt"]
       [:td "Egypt"]]
      [:tr
       [:td "16"]
       [:td "South_America:Continent:Place"]
       [:td "South_America"]
       [:td "South America"]]
      [:tr
       [:td "17"]
       [:td "Bolivia:Country:Place"]
       [:td "Bolivia"]
       [:td "Bolivia"]]
      [:tr
       [:td "21"]
       [:td "Turkey:Country:Place"]
       [:td "Turkey"]
       [:td "Turkey"]]]]))

(defn table-rel []
  (list
    [:table {:class "cell-border stripe", :id "tblRel"}
     [:thead
      [:tr
       [:th {:class "cid"} "ID"]
       [:th {:class "clabels"} "Labels"]
       [:th {:class "cname"} "Name"]
       [:th {:class "ctype"} "Rel. Type"]
       [:th {:class "crleft"} "Name Left"]
       [:th {:class "crright"} "Name Right"]]]
     [:tbody
      {}
      [:tr
       [:td "0"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "from"]
       [:td "Precessional_Era_of_Leo"]
       [:td "Earth"]]
      [:tr
       [:td "1"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "in orbit around"]
       [:td "Earth"]
       [:td "Sol"]]
      [:tr
       [:td "2"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "in"]
       [:td "Sol"]
       [:td "Milky_Way"]]
      [:tr
       [:td "3"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "in"]
       [:td "Milky_Way"]
       [:td "Universe"]]
      [:tr
       [:td "4"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "in"]
       [:td "Universe"]
       [:td "GOD"]]
      [:tr
       [:td "5"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "in"]
       [:td "Adam_is_Created"]
       [:td "Africa"]]
      [:tr
       [:td "6"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "on"]
       [:td "Africa"]
       [:td "Earth"]]
      [:tr
       [:td "7"]
       [:td "INVOLVED"]
       [:td "INVOLVED"]
       [:td "with Event"]
       [:td "Adam"]
       [:td "Adam_is_Created"]]
      [:tr
       [:td "8"]
       [:td "LOCATION"]
       [:td "LOCATION"]
       [:td "on"]
       [:td "Middle_East"]
       [:td "Earth"]]
      [:tr
       [:td "9"]
       [:td "MARRIED"]
       [:td "MARRIED"]
       [:td "Husband"]
       [:td "Adam_Ben_YHWH"]
       [:td "Eve_Isha_Adam"]]
      [:tr
       [:td "10"]
       [:td "FATHER"]
       [:td "FATHER"]
       [:td "to son"]
       [:td "Adam_Ben_YHWH"]
       [:td "Seth_Ben_Adam"]]
      [:tr
       [:td "11"]
       [:td "MOTHER"]
       [:td "MOTHER"]
       [:td "to son"]
       [:td "Eve_Isha_Adam"]
       [:td "Seth_Ben_Adam"]]]]))

(defn pageContent []
  [:div {:class "tab-content"}
   [:div {:class "tab-pane active datascroll", :id "one"} (table-events)]
   [:div {:class "tab-pane datascroll", :id "two"} (table-people)]
   [:div {:class "tab-pane", :id "three"} (table-places)]
   [:div {:class "tab-pane", :id "four"} (table-rel)]])

(defn page
  "Index/Browse Page for History of the World.
  Argument(s): NONE"
  []
  (hcore/html
    (hic/html5 {:lang "en"}
      (snippets/head "index" "Dot Net II: History of the World: Browse")
       [:body
        [:div {:class "container"}
         ;; Load the Bootstrap 3 responsive menu
         (menus/playmenu "index")
         [:div {:class "row", :id "contentRow"}
          [:div {:class "col-md-12"}
           (pctabs)
           (pageContent)]]
         [:div {:class "row", :id "footerRow"}
          [:div {:class "col-md-6"} (snippets/statuspanel)]
          [:div {:class "col-md-6"} (snippets/socialmediapanel)]]]
        (snippets/loadjsscripts "index")])))
