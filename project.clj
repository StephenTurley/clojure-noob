(defproject clojure-noob "0.1.0-SNAPSHOT"
  :description "Learning Clojre from Brave Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-noob.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} :dev {:dependencies [[speclj "3.3.0"]]}}
  :plugins [[speclj "3.3.0"]]
  :test-paths ["spec"])

