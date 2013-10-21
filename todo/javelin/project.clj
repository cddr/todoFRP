(defproject javelin "0.1.0"
  :description "TodoFRP using Javelin"
  :min-lein-version "2.0.0"
  :source-paths ["src/cljs"]
  :plugins [[lein-cljsbuild "0.2.10"]]
  :dependencies [[tailrecursion/javelin "2.0.3"]
                 [domina "1.0.2-SNAPSHOT"]
                 [prismatic/dommy "0.0.2"]]
  :cljsbuild {:builds
              [{:source-path "src/cljs"
                :compiler {:output-to "public/todo.js"
                           :pretty-print false
                           :optimizations :advanced}}]})
