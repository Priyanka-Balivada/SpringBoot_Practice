package com.postman.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
