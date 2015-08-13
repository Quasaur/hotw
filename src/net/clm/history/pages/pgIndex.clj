(ns net.clm.history.pages.pgIndex
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]))


(defn page
      "Index Page for History of the World."
      []
      (hcore/html
        (hic/html5
        (snippets/head "Dot Net II: History of the World: Browse")
         [:body {}
          [:h1 {:class "title"} "History of the World"]
          [:div {:id "tabsF"} (snippets/tabsf)]
          [:div {:id "content"}
           [:iframe {:frameborder "0",
                     :scrolling "auto",
                     :src "https://docs.google.com/spreadsheet/pub?key=0AuW1vC5u5nOAdDhvNDQ1X0c1UGptaFlSclpzTDlaRFE&single=true&gid=0&output=html",
                     :width "100%",
                     :height "600"}]]])))
