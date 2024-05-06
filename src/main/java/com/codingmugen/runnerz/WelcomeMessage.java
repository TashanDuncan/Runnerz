package com.codingmugen.runnerz;

import org.springframework.stereotype.Component;

@Component // This annotation tells Spring Boot that this class is a Spring
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "Welcome to the world of Spring Boot!";
    }
}
