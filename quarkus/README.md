# quarkus-picocli-jline-example
Quarkus picocli JLine Example with native build (GraalVM)

- [Quarkus 3](https://quarkus.io/blog/road-to-quarkus-3/)
- [picocli](https://picocli.info/)
- [JLine 3](https://github.com/jline/jline3)

## Native Build
```
./mvnw clean package -Dnative
```
(See Quarkus [Building a native executable](https://quarkus.io/guides/building-native-image#prerequisites) for required setup)

## Run
```
./target/example-shell-runner
```

## Test
- Start with `clear` command
- Try `help`
- Try `cmd` with TAB for code completion
- Type `exit` to leave shell

## Limitations
Tested only on Ubuntu (Windows may not work)
