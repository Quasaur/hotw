(ns ^{:author "Calvin L. Mitchell"
      :doc "Links page for History of the World."}
    net.clm.history.pages.pgSeek
  (:require [hiccup.core :as hcore]
            [hiccup.page :as hic]
            [net.clm.history.pages.snippets :as snippets]
            [net.clm.history.pages.menus :as menus]))

(defn pageContent []
  (list
    [:div {:id "links"}
     [:fieldset
      [:legend "Links"]
      [:a {:shape "rect", :href "mailto:webmaster@clmitchell.net", :target "_blank"} "Contact Us for any Suggestions, Corrections or Feedback"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "https://github.com/Quasaur/History-of-the-World", :target "_blank"} "History of the World on GitHub.com"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.clmitchell.net/", :target "_blank"} "Calvin's Dot Net II"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.12x30.net/terms.html", :target "_blank"} "Calendrical Terms"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.fourmilab.ch/cgi-bin/Solar", :target "_blank"} "Solar System Live"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.bibletime.com/home/welcome/intro/bible-time-lines-and-theory-from-adam-to-the-present-including-prophetic", :target "_blank"} "Bible Time"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.timehasanend.org", :target "_blank"} "Time Has An End"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.nabataea.net/bstudents.html", :target "_blank"} "Biblical Geography and Chronology"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://mapsofwar.com/ind/imperial-history.html", :target "_blank"} "Maps of War"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.ancientworlds.net/", :target "_blank"} "Ancient Worlds"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.hyperhistory.com/online_n2/History_n2/a.html", :target "_blank"} "Hyperhistory Online"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.history.com/", :target "_blank"} "The History Channel Online"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.friesian.com/notes/newking.htm", :target "_blank"} "Ancient King Lists"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.wa-wd.com/", :target "_blank"} "Who's Alive - Who's Dead"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.badley.info/history/", :target "_blank"} "World History Database"] [:br {:clear "none"}] [:br {:clear "none"}]
      [:a {:shape "rect", :href "http://www.computerhistory.org/timeline/", :target "_blank"} "Timeline of Computer History"] [:br {:clear "none"}] [:br {:clear "none"}]]]))


(defn page
      "Web Links Page for History of the World.
      Argument(s): NONE"
      []
      (hcore/html
        (hic/html5
        (snippets/head "seek" "Dot Net II: History of the World: Seek")
        [:body
         [:div {:class "container"}
          ;; Load the Bootstrap 3 responsive menu
          (menus/playmenu "seek")
          [:div {:class "row", :id "contentRow"}
           [:div {:class "col-md-12"}
            [:div {:class "tab-content datascroll"}
             (pageContent)]]]
          [:div {:class "row", :id "footerRow"}
           [:div {:class "col-md-6"} (snippets/statuspanel)]
           [:div {:class "col-md-6"} (snippets/socialmediapanel)]]]
         (snippets/loadjsscripts "seek")])))
