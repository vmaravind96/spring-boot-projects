package com.aravind.lil.learningspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // All methods should return json / xml
    // @RestController: Equivalent to @Controller and @ResponseBody annotation

    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world !";
    }

    @GetMapping("/hello-world-app")
    public String helloWorldApp() {
        return "Hello world App!";
    }
}
