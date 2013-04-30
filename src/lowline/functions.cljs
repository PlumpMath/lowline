
;; ClojureScript implementation of some useful stuff from underscore.js 
;; that is missing from the standard library.

(ns lowline.functions)

(defn debounce 
  ([f] (debounce f 1000))
  ([f timeout]
    (let [id (atom nil)]
      (fn [evt]
        (if (not (nil? @id))
          (js/clearTimeout @id))
        (reset! id (js/setTimeout
                   (partial f evt)
                   timeout))))))
 
