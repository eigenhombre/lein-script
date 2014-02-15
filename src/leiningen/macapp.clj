(ns leiningen.macapp
  (:use [leiningen.core.eval :only [eval-in-project]])
  (:require [leiningen.core.main :as main]))


(defn macapp [project & args]
  (println "Mac'in the App!!!"))
