package ua.tascors.baseexitsapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExitsController {
    @GetMapping
    public ResponseEntity<?> all() {
        return null;
    }
}