package com.aravind.lil.learningspring.sub1;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent1 {
    public String getMessage() {
        return "Hello ! I am component 1.";
    }
}
