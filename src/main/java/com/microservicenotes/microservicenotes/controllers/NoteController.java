package com.microservicenotes.microservicenotes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    @GetMapping("/simple")
    public String simpleGet() {
        return "Simple GET endpoint!";
    }
}
