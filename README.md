# picoli-jline-example
Demonstrates the combination of [Picoli](https://picocli.info/), [jline 3](https://github.com/jline/jline3) and [Quarkus 3](https://quarkus.io/blog/road-to-quarkus-3/) or [Spring Boot]() to build a command shell.

## Modules
- [quarkus](quarkus)
- [spring-boot](spring-boot)

## Build
To build the project as "uber jar":

```
./mvwn clean package
```

### Run Quarkus Example
```
java -jar quarkus/target/example-shell-runner.jar
```

:information_source: You can create also a native executable. See [quarkus](quarkus) build information.


### Run Spring Boot Example
```
java -jar spring-boot/target/example-shell-runner.jar
```

## Test
- Start with `clear` command
- Try `help`
- Try `cmd` with TAB for code completion
- Type `exit` to leave shell
