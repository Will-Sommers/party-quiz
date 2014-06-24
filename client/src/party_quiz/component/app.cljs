(ns party-quiz.components.app
  (:require
   [om.core :as om]
   [om-tools.core :refer-macros [defcomponent]]
   [om-tools.dom :as dom :include-macros true]))

(defcomponent card-component [data owner]
  (display-name [_]
    "Card Component")

  (init-state [_]
             {:show-card? false})

  (render-state [_ {:keys [:show-card?]}]
                (println "Test")
                (dom/div {:class "card-wrapper"}
                         (dom/div {:class "card-value"
                                   :on-click (om/set-state! owner :show-card? true)} (:value data))
                         (if show-card?
                           (dom/div "testing")))))

(defcomponent column-component [data owner]
  (display-name [_]
    "Column Component")

  (render [_]
          (dom/div {:class "column-wrapper"}
                   (dom/div {:class "column-header"} (:name data))
                   (om/build-all card-component (:cards data)))))

(defcomponent board-component [data owner]

  (display-name [_]
   "Board Component")

  (render [_]
          (dom/div {:class "board-wrapper"}
                   (dom/div {:class "board-header"} (:name data))
                   (om/build-all column-component (:columns data)))))

(defcomponent app-component [data owner]

  (display-name [_]
    "App Component")

  (render [_]
          (dom/div
           (dom/header nil)
           (dom/div {:class "container"}
                    (om/build board-component (:board data)))
           )))
