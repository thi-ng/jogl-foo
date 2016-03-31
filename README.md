# jogl232-foo

Tiny (temporary) test project for using JOGL w/ thi.ng/geom. Work is currently underway, integrating JOGL properly with thi.ng/geom, providing an unified way to work with both desktop OpenGL & WebGL (under Clojure/Clojurescript).

## Usage

```
lein trampoline run
```

Or build `uberjar` (currently only OSX):

```
lein with-profile osx uberjar
java -jar target/jogl232-foo-0.1.0-SNAPSHOT-standalone.jar
```

Press Esc to close window / quit.

## License

Copyright © 2016 Karsten Schmidt

Distributed under the Apache Software License 2.0.
