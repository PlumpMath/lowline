
# Underscore-ish Utils for ClojureScript

Currently only contains _debounce_, but I might add more if they're useful.

## Usage

```clojure
(ns my.namespcae
  (:require [lowline.functions :refer [debounce]]))

(defn handler [evt]
  (js/alert "Event!"))

(listen node
        :keyup
        (debounce handler 500))
```

