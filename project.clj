(defproject script/lein-template "0.0.5"
  :description "Leiningen plugin/template for generating stand-alone Clojure scripts"
  :url "http://github.com/eigenhombre/lein-script"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/mit-license.php"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [lein-exec "0.3.1"]]
  :min-lein-version "2.0.0"
  :eval-in-leiningen true
  :scm {:name "git"
         :url "https://github.com/eigenhombre/lein-script"})
