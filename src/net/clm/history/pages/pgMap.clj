(ns ^{:author "Calvin L. Mitchell"
      :doc "Google Maps page for History of the World."}
    net.clm.history.pages.pgMap
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]
      [net.clm.history.pages.menus :as menus]))

(defn pageContent []
  (list [:iframe {:frameborder "0",
                  :marginheight "0",
                  :marginwidth "0",
                  :src "https://www.google.com/fusiontables/embedviz?viz=MAP&q=select+col6+from+3490855+&h=false&lat=61.68987220046001&lng=141.29056319999995&z=3&t=1&l=col6",
                  :width "100%",
                  :height "700"} "Loading"]))

(defn page
      "Map Page for History of the World.
      Argument(s): NONE"
      []
      (hcore/html
        (hic/html5
          (snippets/head "map" "Dot Net II: History of the World: Map")
          [:body
           [:div {:class "container"}
            ;; Load the Bootstrap 3 responsive menu
            (menus/playmenu "map")
            [:div {:class "row", :id "contentRow"}
             [:div {:class "col-md-12"}
              [:div {:class "tab-content datascroll"}
               (pageContent)]]]
            [:div {:class "row", :id "footerRow"}
             [:div {:class "col-md-6"} (snippets/statuspanel)]
             [:div {:class "col-md-6"} (snippets/socialmediapanel)]]]
           (snippets/loadjsscripts "chart")])))
