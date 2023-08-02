package ru.dnk.coffeelovers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1")
public class IndexController {
    @GetMapping("/index")
    String get() {
        return "index";
    }
}
