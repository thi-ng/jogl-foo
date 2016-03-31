(defproject jogl232-foo "0.1.0-SNAPSHOT"
  :repositories {"jogamp" "http://jogamp.org/deployment/maven"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.jogamp.gluegen/gluegen-rt "2.3.2"]
                 [org.jogamp.jogl/jogl-all "2.3.2"]
                 [thi.ng/geom "0.0.1062"]]
  :profiles {:osx {:dependencies [[org.jogamp.gluegen/gluegen-rt "2.3.2"
                                   :classifier "natives-macosx-universal"]
                                  [org.jogamp.jogl/jogl-all "2.3.2"
                                   :classifier "natives-macosx-universal"]]}}
  :main jogl232foo.core
  :aot :all)
