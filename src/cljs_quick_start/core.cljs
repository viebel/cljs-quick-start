(ns cljs-quick-start.core
  (:require [cljs.repl.browser :as repl])

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)
(print "you quick-start!")
