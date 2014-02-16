#!/usr/bin/env lein-exec

(require 'leiningen.exec)

(comment  ;; import example:
  
  (leiningen.exec/deps '[[clj-time "0.6.0"]])

  (require '[clj-time.core :refer [now]]))

(println "Welcome to {{name}}!")
