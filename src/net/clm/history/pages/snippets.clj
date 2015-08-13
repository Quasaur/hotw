(ns net.clm.history.pages.snippets
    (:require [hiccup.page :as hic]))

(defn cssfiles
      "Snippet for CSS links depending on which page is loaded."
      []
      (hic/include-css "/css/hcspry.css"
                       "/css/menus.css"
                       "/css/filter.css"
                       "/css/wc3xhtml1.css"))

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
      "Snippet for the <head> tag of the page"
      [argTitle]
      [:head
       [:title argTitle]
       (cssfiles)
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
       [:li [:a {:shape "rect", :href "add.php", :title "Add Events"} [:span "Add"]]]
       [:li [:a {:shape "rect", :href "map.php", :title "Map Events"} [:span "Map"]]]
       [:li [:a {:shape "rect", :href "cha.php", :title "Chart Events"} [:span "Chart"]]]
       [:li [:a {:shape "rect", :href "doc.php", :title "Docs"} [:span "Learn"]]]
       [:li [:a {:shape "rect", :href "clg.php", :title "Change Log"} [:span "Changes"]]]
       [:li [:a {:shape "rect", :href "lnk.php", :title "Links"} [:span "Seek"]]]])

