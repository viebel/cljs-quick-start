(require 'cljs.build.api)

(cljs.build.api/build "src" {:main 'cljs-quick-start.core
                             :output-to "out/main.js"})
