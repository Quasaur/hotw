(ns net.clm.history.pages.pgLearn
 (:require [hiccup.core :as hcore]
           [hiccup.page :as hic]
           [net.clm.history.pages.snippets :as snippets]
           [net.clm.history.pages.menus :as menu]))


(defn pageContent []
  (list
    [:div {:id "docs"}
     [:p {} "NOTE: THIS PAGE IS STILL UNDER CONSTRUCTION!"]
     [:h1 {:class "doc"} "INTRODUCTION"]
     [:p {} "My History of the World was begun in 2007 as a project to \"accentuate\" the historical veracity of the Biblical Narrative. My own interests are quite eclectic; and it has always been my intention in this History to touch every country and tribe in as many subjects and issues as possible."]
     [:p {} "Obviously such an endeavor is far beyond the capabilities of one person; and so everyone can now contribute to my project."]
     [:h1 {:class "doc"} "A. BROWSE"]
     [:p {} "The Browse tab provides a view of all the current content in the History of the World database."]
     [:h2 {:class "doc"} "A.1. Filters"]
     [:p {} "By default the Browse tab displays all records. The filters allow you to view specific data."]
     [:ul {}
      [:li {} [:strong {} "Type."] " Click on the arrows of the combo box to see the available types of events. The list is dynamic; and changes as more types are added."]
      [:li {} [:strong {} "Continent."] " Click on the arrows of the combo box to see the list of land masses. The list is fixed, and will not be changed. The \"Earth\" entry is unique in two aspects: (1) It's used primarily for entries that deal with astronomical events (the \"Astro\" event type); (2) The \"Earth\" entry doesn't map on the Map tab."]
      [:li {} [:strong {} "Region."] " The Region filter is a text field in which you can type any text word that currently exists in the Region field of the database. For instance: entries that have \"Rome, Italy\" as the Region can be searched for either as \"Rome\" or \"Italy\" (of course typing \"Italy\" will give you all locations in Italy, including Rome). The Region text field is case-insensitive (\"rome\" is the same as \"Rome\"). INCOMPLETE WORDS ARE NOT ACCEPTED (\"rom\" will not give any results...\"Rome\" will)."]
      [:li {} [:strong {} "Description."] " The Description filter is a text field in which you can type any text word that exists in the Description field of the database. Like the Region field, the Description is case-insensitive; and INCOMPLETE WORDS ARE NOT ACCEPTED."]] [:p {} "All four filters can be used at the same time. When you have set one or more filters press the Apply button or the Enter key on your keyboard to see the new view of data according to the filters."]
     [:h3 {:class "doc"} "A.1.a. Either/Or Filter (';' - Text Fields Only)"]
     [:p {} "The Either/Or operator (a semi-colon, ';') can be used to filter on MULTIPLE POSSIBLE VALUES in the Region and Description filter fields (i.e., \"Birth;Death\" to get all births and deaths)\n\n"]
     [:h3 {:class "doc"} "A.1.b. Filters Troubleshooting"]
     [:p {} "It's important to remember that, if you're using MORE THAN ONE FILTER, the application with attempt to locate data that meets ALL the filter criteria."]
     [:h2 {:class "doc"} "A.2. Fields"]
     [:p {} "Following are descriptions for the fields used in my History of the World."]
     [:h3 {:class "doc"} "A.2.a. Bible Year"]
     [:p {} "The Bible Year is calculated based on the work of " [:a {:shape "rect", :href "http://www.bibletime.com/tool/time/gregorian", :target "_blank"} "Phil Stone"] ". Year One of the Bible Calendar is (allegedly) the creation of Adam."]
     [:h3 {:class "doc"} "A.2.b. Gregorian Year"]
     [:p {} "The modern calendar in use throughout most of the world today is the Gregorian calendar, named after the Pope who introduced it in 1585. It was not adopted in the United States until an act of the English Parliament made it law throughout the English Empire in 1752. Since that time most other countries have adopted the Gregorian calendar. The Gregorian calendar is used for most commerce throughout most of the world."]
     [:p {} "It does happen on occasion that 2 or more events happen in the same year. I use a decimal system on years that have more than one event to place the events in the proper order...you're welcome to do the same when you add events using the ADD tab."]
     [:h3 {:class "doc"} "A.2.c. Type"]
     [:p {} "The Type field identifies the type of event. Current event typess include:"]
     [:ul {}
      [:li {} [:strong {} "Ascension"] " - the PHYSICAL transit of a being from Earth to Heaven."]
      [:li {} [:strong {} "Astro"] " -astronomical (NOT astrological) events."]
      [:li {} [:strong {} "Biologic"] " - epidemics, pandemics, plagues, etc."]
      [:li {} [:strong {} "Birth"] " -notable human births."]
      [:li {} [:strong {} "Bloodline"] " -genetic relations between individuals (primarily but not exclusively royalty)."]
      [:li {} [:strong {} "Calendar"] " -events relating to the calendars of different cultures; events related to the development of calendar systems."]
      [:li {} [:strong {} "City"] " -events related to the founding/developing of cities."]
      [:li {} [:strong {} "Construction"] " -famous or well-known building and construction projects."]
      [:li {} [:strong {} "Conversion"] " -conversion of famous/infamous individuals to Christ/Christianity."]
      [:li {} [:strong {} "Covenant"] " -binding oaths between God and man."]
      [:li {} [:strong {} "Crown"] " -royal successions."]
      [:li {} [:strong {} "Culture"] " - anthropological events related to the development of cultures."]
      [:li {} [:strong {} "Death"] " -notable human deaths."]
      [:li {} [:strong {} "Dearth"] " - events related to famine."]
      [:li {} [:strong {} "Education"] " - the founding/building of educational institutions."]
      [:li {} [:strong {} "Exploration"] " - the discovery and documentation of new places (Earth and outer space)."]
      [:li {} [:strong {} "Geo"] " - notable geological events (documentation/development of rivers, volcanoes, earthquakes, floods, desertification, tsunamis, etc."]
      [:li {} [:strong {} "Genocide"] " - While a precise definition varies among scholars, a legal definition is found in the 1948 United Nations Convention on the Prevention and Punishment of the Crime of Genocide (CPPCG). Article 2 of this convention defines genocide as \"any of the following acts committed with intent to destroy, in whole or in part, a national, ethnical, racial or religious group, as such: killing members of the group; causing serious bodily or mental harm to members of the group; deliberately inflicting on the group conditions of life, calculated to bring about its physical destruction in whole or in part; imposing measures intended to prevent births within the group; [and] forcibly transferring children of the group to another group.\""]
      [:li {} [:strong {} "Invention"] " - anything created/developed by humanity."]
      [:li {} [:strong {} "Language"] " - developments in any human language, whether written, spoken or non-verbal."]
      [:li {} [:strong {} "Life"] " - for instances where Births and Deaths pair up (happen to the same person."]
      [:li {} [:strong {} "Literature"] " - developments in any written/carved/typed/drawn expression of human thought."]
      [:li {} [:strong {} "Miracle"] " - events that cannot be accounted for by any known law of physics or human will."]
      [:li {} [:strong {} "Migration"] " -physical movement by humans from one area to another, sometimes over long distances or in large groups."]
      [:li {} [:strong {} "Monument"] " - any object the construction of which serves the purpose of rememberance."]
      [:li {} [:strong {} "Music"] " - major events in the development of music."]
      [:li {} [:strong {} "Political"] " - notable events involving the process by which groups of people make collective decisions. The term is generally applied to behavior within civil governments, but politics has been observed in other group interactions, including corporate, academic, and religious institutions."]
      [:li {} [:strong {} "Prophetic"] " - events regarding the issuance or fulfillment of Divine Prophecy."]
      [:li {} [:strong {} "Religion"] " - events regarding the rise and development of religions (founders, councils, ecumenial, etc."]
      [:li {} [:strong {} "Revelation"] " - testimonies of direct encounters with God."]
      [:li {} [:strong {} "Science"] " - developments in science and technology."]
      [:li {} [:strong {} "Speech"] " - famous speeches."]
      [:li {} [:strong {} "Slavery"] " - events in the development of the slave trade."]
      [:li {} [:strong {} "Terrorism"] " - acts of terrorism."]
      [:li {} [:strong {} "War"] " - famous battles and wars."]]
     [:h3 {:class "doc"} "A.2.d. Continent and Region"]
     [:p {} "Continent and Region are used to identify the location of each event. The Region field (country, state, providence, county, city, etc.) is used to map the locations on the Map tab."]
     [:h3 {:class "doc"} "A.2.f. Description"]
     [:p {} "Enter your Event Description in the text area provided.  At this time the use of xhtml and html has been discontinued and is prohibited."]
     [:p {} "Four items can be included in your Event Description:"]
     [:ol {}
      [:li {} [:strong {} "Detailed Location."] " For example: if the Continent is \"Americas\" and the region is Los Angeles, California, a Detailed Location would be \"Inglewood\" or \"Manhattan Beach\""]
      [:li {} [:strong {} "Description Body."] " that includes the essential points."]
      [:li {} [:strong {} "Date(s)"] "...in the format 01-Jan-2008."]
      [:li {} [:strong {} "\"Submitted by\" Statement"] " with your Name and Email address (use '(at)' instead of '@') or Nickname."]]
     [:h3 {:class "doc"} "A.2.g. Web Link"]
     [:p {} "The Web Link Field shows the URL of the information source. Though the web link only shows the domain of the URL, placing your mouse over the link should show the entire URL."]
     [:h3 {:class "doc"} "A.2.h. Last Modified"]
     [:p {} "The Last Modified field is provided by " [:a {:shape "rect", :href "http://www.dabbledb.com", :target "_blank"} "Dabble DB"] " to indicate when the record was either created or updated last."]
     [:h2 {:class "doc"} "A.3. Pagination"]
     [:p {} "The pagination controls are at the bottom of the page, and provde a 1st, previous, next and last link for listings that span more than one page."]
     [:h2 {:class "doc"} "A.4. Printing"]
     [:p {} "Pressing the Printing button will display a dialog box for the creation and download of a PDF document containing the current Browse view. the dialog box will have the following options:"]
     [:ul {}
      [:li {} [:strong {} "Paper Size."] " Letter, Legal, Tabloid, A4, A3"]
      [:li {} [:strong {} "Paper Orientation"] " Portrait, Landscape"]
      [:li {} [:strong {} "Printing Format"] " Table View, Individual Entries"]]
     [:p {} "When the desired choices have been made, Press the \"Create PDF\" button."]
     [:h1 {:class "doc"} "B. ADD"]
     [:p {} "The Add tab gives everyone the opportunity to add content to my History of the World."]
     [:p {} "You can view Section A of this document to get an explanation of each field; but there are a few things you should know about the Add tab:"]
     [:ol {}
      [:li {} "The Add tab is missing the Bible Year. I haven't yet obtained the formula to fill in the Bible Year automatically."]
      [:li {} "There are three fields on the Add tab that you don't see anywhere else: Duration, Greg End, Caption and Image. These fields were added to provide compatibility with the SIMILE Timeline widget used in the Chart tab. Duration (when checked) means that there is a corresponding Gregorian End Year (Greg. End) so that in the Chart tab a line will be drawn between the \"Year Gregorian\" and the \"Greg. End\" year. If you check Duration be sure to put in a Greg. End year. The Caption field displays its contents in the popup field of the Timeline on the Chart tab. The Image is the URL of an image that will be displayed in the SIMILE Timeline bubble that displays whenever an event is clicked on. NOTE: Be sure that the image URL you select is publickly available to everyone in the world!"]
      [:li {} "DO NOT USE double quotes in the Caption, Region or Description fields; use single quotes only. This makes exporting the data to the SIMILE Timeline and MySQL databases much easier."]
      [:li {} "The \"Submit Form\" button will added the new entry to the database. I will then review the entry and (if the entry is approved) will add the Bible Year."]]
     [:h1 {:class "doc"} "C. MAP"]
     [:p {} "The Map tab provides a geographic context to the History of the World entries. The Map Tab provides a count of entries in each country/region and when clicked, will drill down one level for a closer look. The Map tab can be filtered just like the Browse tab (see section A.1 above)."]
     [:h1 {:class "doc"} "D. CHART"]
     [:p {} "The Chart tab (this page) presents a timeline of events using the MIT SIMILE Timeline framework."]
     [:h1 {:class "doc"} "D. LEARN"]
     [:p {} "The Learn tab (this page) documents all of my History's features."]
     [:h1 {:class "doc"} "E. SEEK"]
     [:p {} "The Seek tab  contains useful links for the student of history. I would like to call your attention to two of those links:"]
     [:h2 {:class "doc"} "E.1. Changelog for This App"]
     [:p {} "This link leads to an article on my main website that keeps track of the changes I make to my History, including the addition of any historical events."]
     [:h2 {:class "doc"} "E.2. Contact Us for any Suggestions, Corrections or Feedback"]
     [:p {} "This links goes to the Contact Us page of the main website. I get a lot of spam on that email account; so be sure to include \"History of the World\" in the subject so that I know NOT to delete your message."]]))

(defn page
 "Index/Browse Page for History of the World.
 Argument(s): NONE"
 []
 (hcore/html
  (hic/html5 {:lang "en"}
             (snippets/head "learn" "Dot Net II: History of the World: Documentation")
             [:body
              [:div {:class "container"}
               ;; Load the Bootstrap 3 responsive menu
               (menu/playmenu "learn")
               [:div {:class "row", :id "contentRow"}
                [:div {:class "col-md-12"}
                 [:div {:class "tab-content datascroll"}
                  (pageContent)]]]
               [:div {:class "row", :id "footerRow"}
                [:div {:class "col-md-6"} (snippets/statuspanel)]
                [:div {:class "col-md-6"} (snippets/socialmediapanel)]]]
              (snippets/loadjsscripts "chart")])))
