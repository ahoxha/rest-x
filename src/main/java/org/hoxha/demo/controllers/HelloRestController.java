package org.hoxha.demo.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("hello")
    public String hello() {
        return "Hello from rest-x! By the way, I am running inside a docker container.\r\n\r\nTime: " + LocalDateTime.now().toString();
    }
}
