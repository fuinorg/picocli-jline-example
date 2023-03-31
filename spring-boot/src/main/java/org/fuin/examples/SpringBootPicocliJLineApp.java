package org.fuin.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;

/**
 * Example that demonstrates how to build an interactive shell with Quarkus 3, JLine3 and picocli.
 */
@SpringBootApplication
@CommandLine.Command(name = "demo", mixinStandardHelpOptions = true)
public class SpringBootPicocliJLineApp {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(SpringBootPicocliJLineApp.class, args)));
    }

}
