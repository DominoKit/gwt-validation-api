![GWT3/J2CL compatible](https://img.shields.io/badge/GWT3/J2CL-compatible-brightgreen.svg)

# domino-slf4j-logger
Enable using slf4j loggers inside GWT client side code, which increase code portability to the JVM where the slf4j logging is preferred.

### Maven dependencies

```
<dependency>
    <groupId>org.dominokit</groupId>
    <artifactId>domino-slf4j-logger</artifactId>
    <version>1.0-rc.4-SNAPSHOT</version>
</dependency>
```

### GWT2 Inherits

```
<inherits name="org.dominokit.domino.logger.Logging"/>
```

### Usage


```
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

...

private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

...

LOGGER.info("I cann use SLF4J logger in gwt client side code.");
```



