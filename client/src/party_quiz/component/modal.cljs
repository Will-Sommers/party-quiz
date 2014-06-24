(ns party-quiz.components.modal
  (:require
   [om.core :as om]
   [om-tools.core :refer-macros [defcomponent]]
   [om-tools.dom :as dom :include-macros true]))

(defcomponent modal-component [data owner]
  (render [_]
          (dom/div {:class "modal-wrapper"} "hj")))
