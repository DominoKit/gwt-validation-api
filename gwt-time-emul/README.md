gwt-time-dummy
==============

Dummy GWT emulation classes for `java.time.Clock` and `java.time.Duration` without functionality!
It's only used to enable build and use of validation engine, no need to use this in any other project.

> Adding any other dependency that provides a proper emulation for Java time will require the exclusion of this dependency.

Maven integraten
----------------

The dependency itself for GWT-Projects:

```xml
    <dependency>
      <groupId>org.dominokit</groupId>
      <artifactId>gwt-time-emul</artifactId>
      <version>[version]</version>
    </dependency>
```

GWT Integration
---------------

```xml
<inherits name="java.time.Time" />
```
