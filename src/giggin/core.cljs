(ns giggin.core
    (:require 
      [reagent.core :as r]
      [reagent.dom :as d]
     [giggin.components.header :refer [header]]
     [giggin.components.gigs :refer [gigs]] 
     [giggin.components.orders :refer [orders]]
     [giggin.components.footer :refer [footer]]
     ))


;; -------------------------
;; Views

(defn home-page []
  [:div.container 
   [header]
   [gigs]
   [orders]
   [footer]
   ])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
