(ns party-quiz.core
  (:require-macros [cljs.core.async.macros :refer [go alt!]])
  (:require
   [cljs.core.async :as async :refer [>! <! alts! chan sliding-buffer put! close!]]
   [om.core :as om]
   [party-quiz.app-state :refer [app-state]]
   [party-quiz.components.app :as app]
   [party-quiz.components.modal :as modal]))

(enable-console-print!)



(defn ^:export init-app
  []
  (om/root
   app/app-component
   app-state
   {:target (. js/document (getElementById "app"))})

  #_(om/root
   modal/modal-component
   app-state
   {:target (. js/document (getElementById "modal-wrapper"))})
  )
