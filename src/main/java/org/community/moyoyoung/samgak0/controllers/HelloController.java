package org.community.moyoyoung.samgak0.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Author : MinU Bak
@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse sayHello() {
        return new HelloResponse("Hello World");
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HelloResponse {
        private String message;
    }

}
