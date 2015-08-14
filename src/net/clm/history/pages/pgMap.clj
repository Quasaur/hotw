(ns net.clm.history.pages.pgMap
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]))


(defn page
      "Map Page for History of the World."
      []
      (hcore/html
        (hic/html5
        (snippets/head "map" "Dot Net II: History of the World: Map")
         [:body
          [:h1 {:class "title"} "History of the World"]
          [:div {:id "tabsF"} (snippets/tabsf)]
          [:div {:id "contentForm"}
           [:iframe {:frameborder "0",
                     :marginheight "0",
                     :marginwidth "0",
                     :src "https://www.google.com/fusiontables/embedviz?viz=MAP&q=select+col6+from+3490855+&h=false&lat=61.68987220046001&lng=141.29056319999995&z=3&t=1&l=col6",
                     :width "100%",
                     :height "800"} "Loading"]]])))
