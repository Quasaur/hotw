(ns net.clm.history.pages.snippets
    (:require [hiccup.page :as hic]))

(def CLMDEBUG 0)

(defn cssfiles
      "load sets of CSS files depending on which page is being served"
      [pageName]
      (condp = pageName
             "index" (hic/include-css "/css/hcspry.css"
                                      "/css/menus.css"
                                      "/css/filter.css"
                                      "/css/wc3xhtml1.css")
             "add" (hic/include-css "/css/hcspry.css"
                                    "/css/menus.css"
                                    "/css/addform.css")
             "map" (hic/include-css "/css/hcspry.css"
                                    "/css/menus.css"
                                    "/css/SpryCollapsiblePanel.css"
                                    "/css/SpryAccordion.css")
             "chart" (hic/include-css "/css/hcspry.css"
                                      "/css/menus.css"
                                      "/css/filter.css"
                                      "/css/cha.css")
             "learn" (hic/include-css "/css/hcspry.css"
                                      "/css/menus.css"
                                      "/css/filter.css"
                                      "/css/wc3xhtml1.css"
                                      "/css/doc.css")
             "changes" (hic/include-css "/css/hcspry.css"
                                        "/css/menus.css"
                                        "/css/filter.css"
                                        "/css/wc3xhtml1.css"
                                        "/css/clg.css")
             "seek" (hic/include-css "/css/hcspry.css"
                                     "/css/menus.css")
             (println (str  "PRGMR. MSG: net.clm.history.pages.snippets.clj::(defn cssfiles [" pageName "]): unknown parameter or parameter not processed properly."))))

(comment (defn cssfiles
               "load sets of CSS files depending on which page is being served"
               [pageName]
               (hic/include-css "/css/hcspry.css" "/css/menus.css" "/css/filter.css" "/css/wc3xhtml1.css")))



(defn ganalytics
      "Snippet for Google Analytics"
      []
      [:script {:type "text/javascript"}
       "var _gaq = _gaq || [];\r\n
       _gaq.push(['_setAccount', 'UA-2614906-8']);\r\n
       _gaq.push(['_setDomainName', '.clmitchell.net']);\r\n
       _gaq.push(['_trackPageview']);\r\n
       (function() {\r\n
       var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n
       ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n
       var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n
       })();"])

(defn head
      "Snippet for the <head> tag of the page."
      [page argTitle]
      (if (= CLMDEBUG 1)
        (println page argTitle))
      [:head
       [:title argTitle]
       (cssfiles page)
       (comment (ganalytics))])

(defn noscript
      "Snippet for <noscript> tag."
      []
      [:noscript
       [:h1 "This page requires JavaScript. Please enable JavaScript in your browser and reload this page."]])

(defn tabsf
      "Snippet for tabs and their labels"
      []
      [:ul
       [:li [:a {:shape "rect", :href "/", :title "Browse Events"} [:span "Browse"]]]
       [:li [:a {:shape "rect", :href "/add", :title "Add Events"} [:span "Add"]]]
       [:li [:a {:shape "rect", :href "/map", :title "Map Events"} [:span "Map"]]]
       [:li [:a {:shape "rect", :href "/chart", :title "Chart Events"} [:span "Chart"]]]
       [:li [:a {:shape "rect", :href "/learn", :title "Docs"} [:span "Learn"]]]
       [:li [:a {:shape "rect", :href "changes", :title "Change Log"} [:span "Changes"]]]
       [:li [:a {:shape "rect", :href "/seek", :title "Links"} [:span "Seek"]]]])
