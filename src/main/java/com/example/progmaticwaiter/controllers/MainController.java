package com.example.progmaticwaiter.controllers;

import com.example.progmaticwaiter.services.TestDataLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private TestDataLoader testDataLoader;

    public MainController(TestDataLoader testDataLoader) {
        this.testDataLoader = testDataLoader;
    }

    @GetMapping("/load")
    public String loadTestData() {
        testDataLoader.loadData();

        return "redirect:/home";
    }

    @GetMapping("/home")
    public String getHome() {
        return "index";
    }
}
