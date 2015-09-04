(ns net.clm.history.pages.snippets
    (:require [hiccup.page :as hic]))

(def CLMDEBUG 0)

(defn metatags
  " Load sets of CSS files depending on which page is being served\n
  Argument(s) : NONE"
  []
  (list [:meta {:charset "utf-8"}]
        [:meta {:http-equiv "X-UA-Compatible", :content "IE=edge"}]
        [:meta {:name "viewport", :content "width=device-width, initial-scale=1"}]
        [:meta {:name "description", :content "History of the World - New Bootstrap 3 Interface, Old Data"}]
        [:meta {:name "author", :content "Calvin L. Mitchell"}]))

(defn cssfiles
      "Load sets of CSS files depending on which page is being served
      Argument(s):
      pageName: the codename for the page being loaded (index, add, map, chart, learn, changes, seek)."
      [pageName]
      (condp = pageName
             "index" (hic/include-css "/Bootstrap-3.3.5/css/bootstrap.min.css"
                                      "/Bootstrap-3.3.5/css/bootstrap-theme.min.css"
                                      "/_customcss/page.css"
                                      "/_customcss/navbar.css"
                                      "/_customcss/footer.css"
                                      "/_customcss/socialicons.css")
             "add" (hic/include-css "/_oldcss/hcspry.css"
                                    "/_oldcss/menus.css"
                                    "/_oldcss/addform.css")
             "map" (hic/include-css "/_oldcss/hcspry.css"
                                    "/_oldcss/menus.css")
             "chart" (hic/include-css "/_oldcss/hcspry.css"
                                      "/_oldcss/menus.css"
                                      "/_oldcss/cha.css"
                                      "/_oldcss/filter.css")
             "learn" (hic/include-css "/_oldcss/hcspry.css"
                                      "/_oldcss/menus.css"
                                      "/_oldcss/doc.css")
             "change" (hic/include-css "/_oldcss/hcspry.css"
                                        "/_oldcss/menus.css"
                                        "/_oldcss/clg.css")
             "seek" (hic/include-css "/_oldcss/hcspry.css"
                                     "/_oldcss/menus.css")
             (println (str  "PRGMR. MSG: net.clm.history.pages.snippets.clj::(defn cssfiles [" pageName "]): unknown parameter or parameter not processed properly."))))



(defn ganalytics
      "Snippet for Google Analytics
      Argument(s): NONE"
      []
      [:script {:type "text/javascript"}
       "var _gaq = _gaq || [];
       _gaq.push(['_setAccount', 'UA-2614906-8']);
       _gaq.push(['_setDomainName', '.clmitchell.net']);
       _gaq.push(['_trackPageview']);
       (function() {
         var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
         ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
         var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
       })();"])

(defn timelinejs
  "Loads the timeline javascript files for the Chart page.
  Argument(s): NONE"
  []
  (hic/include-js "/timeline/timeline_js/timeline-api.js?bundle=true"
                   "/_oldjs/filter.js"
                   "/_oldjs/histtl.js"))

(defn loadjsscripts
  "Under the new Bootstrap 3 UI, loads the javascript files at the end of the body tag.
  Argument(s): NONE"
  [pageName]
  (condp = pageName
    "index" (hic/include-js "jQuery-2.1.4/jquery-2.1.4.min.js"
                             "Bootstrap-3.3.5/js/bootstrap.min.js"
                             "_customjs/scripts.js")
    "add" (hic/include-js "jQuery-2.1.4/jquery-2.1.4.min.js"
                          "Bootstrap-3.3.5/js/bootstrap.min.js"
                          "_customjs/scripts.js")
    "map" (hic/include-js "jQuery-2.1.4/jquery-2.1.4.min.js"
                          "Bootstrap-3.3.5/js/bootstrap.min.js"
                          "_customjs/scripts.js")
    "chart" (hic/include-js "jQuery-2.1.4/jquery-2.1.4.min.js"
                            "Bootstrap-3.3.5/js/bootstrap.min.js"
                            "_customjs/scripts.js")
    "learn" (hic/include-js "jQuery-2.1.4/jquery-2.1.4.min.js"
                            "Bootstrap-3.3.5/js/bootstrap.min.js"
                            "_customjs/scripts.js")
    "change" (hic/include-js "jQuery-2.1.4/jquery-2.1.4.min.js"
                             "Bootstrap-3.3.5/js/bootstrap.min.js"
                             "_customjs/scripts.js")
    "seek" (hic/include-js "jQuery-2.1.4/jquery-2.1.4.min.js"
                           "Bootstrap-3.3.5/js/bootstrap.min.js"
                           "_customjs/scripts.js")
    (println (str  "PRGMR. MSG: net.clm.history.pages.snippets.clj::(defn loadJSScripts [" pageName "]): unknown parameter or parameter not processed properly."))))


(defn socialmediapanel
  "Boostrap 3 Social Media Panel at the bottom of every page
  Argument(s): NONE"
  []
  (list [:div {:class "panel panel-default"}
         [:div {:class "panel-heading"} [:h3 {:class "panel-title"} [:strong {} "Contact"]]]
         [:div {:class "panel-body", :id "socialpbody"}
          [:div {:id "social"}
           [:a {:shape "rect", :class "facebookBtn smGlobalBtn", :href "https://www.facebook.com/Quasaur", :target "_blank"}]
           [:a {:shape "rect", :class "twitterBtn smGlobalBtn", :href "https://twitter.com/quasaur", :target "_blank"}]
           [:a {:shape "rect", :class "googleplusBtn smGlobalBtn", :href "//plus.google.com/+CalvinMitchell/about", :target "_blank"}]
           [:a {:shape "rect", :class "linkedinBtn smGlobalBtn", :href "https://www.linkedin.com/in/quasaur", :target "_blank"}]
           [:a {:shape "rect", :class "pinterestBtn smGlobalBtn", :href "https://www.pinterest.com/Quasaur/", :target "_blank"}]
           [:a {:shape "rect", :class "tumblrBtn smGlobalBtn", :href "https://www.tumblr.com/blog/quasaur", :target "_blank"}]]]]))

(defn head
      "Snippet for the <head> tag of the page.
      Argument(s):
      page: the codename for the page being loaded (index, add, map, chart, learn, changes, seek).
      argTitle: the text the HTML <title> tag of the page being loaded."
      [page argTitle]
      [:head
       (metatags)
       [:title argTitle]
       (cssfiles page)
       (if (= page "chart") (timelinejs))
       (ganalytics)])

(defn tabsf
      "Snippet for the page tabs and their labels.
      Argument(s): NONE"
      []
      [:ul
       [:li [:a {:shape "rect", :href "/", :title "Browse Events"} [:span "Browse"]]]
       [:li [:a {:shape "rect", :href "/add", :title "Add Events"} [:span "Add"]]]
       [:li [:a {:shape "rect", :href "/map", :title "Map Events"} [:span "Map"]]]
       [:li [:a {:shape "rect", :href "/chart", :title "Chart Events"} [:span "Chart"]]]
       [:li [:a {:shape "rect", :href "/learn", :title "Docs"} [:span "Learn"]]]
       [:li [:a {:shape "rect", :href "change", :title "Change Log"} [:span "Changes"]]]
       [:li [:a {:shape "rect", :href "/seek", :title "Links"} [:span "Seek"]]]])

(defn timelinediv
  "Snippent to contain the timeline chart generated by javascript
  Argument(s): NONE"
  []
  [:div {:id "timeline"}
   [:div {:class "timeline-default", :id "tl", :style "height: 650px; border: 1px solid #aaa; font-size:10pt"}]
   [:div {:style "width: 100%"}
    [:table {:style "text-align: center; width: 100%"}
     [:tr {}
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-11000);"} "11000 BC"]]
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-8000);"} "8000 BC"]]
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-6000);"} "6000 BC"]]
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-4000);"} "4000 BC"]]
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-2000);"} "2000 BC"]]
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(-100);"} "100 BC"]]
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(2000);"} "2000 AD"]]
      [:td {:colspan "1", :rowspan "1"} [:a {:shape "rect", :href "javascript:centerTimeline(4000);"} "4000 AD"]]]]]
   [:div {:class "controls", :id "controls"}]])