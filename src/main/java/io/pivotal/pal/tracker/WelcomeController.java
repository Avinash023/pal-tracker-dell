package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class WelcomeController {

    private String helloMsg = "";


    public WelcomeController(@Value("${WELCOME_MESSAGE}") String message) {
        this.helloMsg = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return helloMsg;
    }
}