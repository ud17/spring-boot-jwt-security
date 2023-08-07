package com.example.controllers;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class Controller {

    @GetMapping("/controller")
    public ResponseEntity<String> pong() {
        return ResponseEntity.ok("Hello from a secured endpoint.");
    }
}
