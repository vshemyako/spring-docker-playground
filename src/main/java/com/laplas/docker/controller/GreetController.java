package com.laplas.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetController {

    @GetMapping
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Hello, stranger!");
    }
}
