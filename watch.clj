(require 'cljs.build.api)

(cljs.build.api/watch "src" {:main 'cljs-quick-start.core
                             :output-to "out/main.js"})
