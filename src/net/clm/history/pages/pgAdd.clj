(ns net.clm.history.pages.pgAdd
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]
      [net.clm.history.pages.menus :as menu]))


(defn page
      "Add Event Page for History of the World.
      Argument(s): NONE"
      []
      (hcore/html
        (hic/html5
        (snippets/head "add" "Dot Net II: History of the World: Add")
         [:body {:id "AddEvent"}
          [:div {:class "container"}
             ;; Load the Bootstrap 3 responsive menu
             (menu/playmenu "add")
             [:div {:class "row", :id "contentRow"}
              [:div {:class "col-md-12"}
               [:div {:class "tab-content datascroll"}
                [:iframe
                 {:frameborder "1",
                  :scrolling "auto",
                  :height "700",
                  :src "https://docs.google.com/spreadsheet/embeddedform?formkey=dHU1SWpjQ1A2cUVkSlBWVC1vNGxzSWc6MA",
                  :width "100%"}
                 "Loading"]]]]
             [:div {:class "row", :id "footerRow"}
              [:div {:class "col-md-6"}
               (snippets/statuspanel)]
              [:div {:class "col-md-6"}
               (snippets/socialmediapanel)]]]
          (snippets/loadjsscripts "add")])))
