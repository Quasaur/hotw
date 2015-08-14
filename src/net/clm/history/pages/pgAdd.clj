(ns net.clm.history.pages.pgAdd
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]))


(defn page
      "Index Page for History of the World."
      []
      (hcore/html
        (hic/html5
        (snippets/head "add" "Dot Net II: History of the World: Add")
         [:body {:id "AddEvent"}
          [:h1 {:class "title"} "History of the World"]
          [:div {:id "tabsF"} (snippets/tabsf)]
          [:div {:id "contentForm"}
           [:iframe {:frameborder "0",
                     :marginheight "0",
                     :marginwidth "0",
                     :src "https://docs.google.com/spreadsheet/embeddedform?formkey=dHU1SWpjQ1A2cUVkSlBWVC1vNGxzSWc6MA",
                     :width "100%",
                     :height "1325"} "Loading"]]])))
