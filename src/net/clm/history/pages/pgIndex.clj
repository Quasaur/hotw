(ns net.clm.history.pages.pgIndex
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]
      [net.clm.history.pages.menus :as menu]))


(defn page
  "Index/Browse Page for History of the World.
  Argument(s): NONE"
  []
  (hcore/html
    (hic/html5 {:lang "en"}
      (snippets/head "index" "Dot Net II: History of the World: Browse")
       [:body
        [:div {:class "container"}
         (menu/playmenu "index")
         [:div {:class "row", :id "contentRow"}
          [:div {:class "col-md-12"}
           [:div {:class "tab-content datascroll"}
            [:iframe {:frameborder "1", :scrolling "auto", :height "600", :src "https://docs.google.com/spreadsheet/pub?key=0AuW1vC5u5nOAdDhvNDQ1X0c1UGptaFlSclpzTDlaRFE&single=true&gid=0&output=html", :width "100%"}]]]]
         [:div {:class "row", :id "footerRow"}
          [:div {:class "col-md-6"}
           [:div {:class "panel panel-default"}
            [:div {:class "panel-heading"} [:h3 {:class "panel-title"} [:strong {} "Status Log"]]]
            [:div {:class "panel-body"}
             [:p "This is the TEST site; for the live site, go " [:a {:shape "rect", :href "http://history.clmitchell.net:82/", :target "_blank"} "HERE"] "."]]]]
          [:div {:class "col-md-6"}
           [:div {:class "panel panel-default"}
            [:div {:class "panel-heading"} [:h3 {:class "panel-title"} [:strong {} "Contact"]]]
            [:div {:class "panel-body", :id "socialpbody"}
             [:div {:id "social"}
              [:a {:shape "rect", :class "facebookBtn smGlobalBtn", :href "https://www.facebook.com/Quasaur", :target "_blank"}]
              [:a {:shape "rect", :class "twitterBtn smGlobalBtn", :href "https://twitter.com/quasaur", :target "_blank"}]
              [:a {:shape "rect", :class "googleplusBtn smGlobalBtn", :href "//plus.google.com/+CalvinMitchell/about", :target "_blank"}]
              [:a {:shape "rect", :class "linkedinBtn smGlobalBtn", :href "https://www.linkedin.com/in/quasaur", :target "_blank"}]
              [:a {:shape "rect", :class "pinterestBtn smGlobalBtn", :href "https://www.pinterest.com/Quasaur/", :target "_blank"}]
              [:a {:shape "rect", :class "tumblrBtn smGlobalBtn", :href "https://www.tumblr.com/blog/quasaur", :target "_blank"}]]]]]]]
        [:script {:type "text/javascript", :src "jQuery-2.1.4/jquery-2.1.4.min.js"}]
        [:script {:type "text/javascript", :src "Bootstrap-3.3.5/js/bootstrap.min.js"}]
        [:script {:type "text/javascript", :src "_customjs/scripts.js"}]])))
