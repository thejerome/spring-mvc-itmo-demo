package com.efimchik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping(value = "hello")
    public String hello1() {
        return "hello1";
    }

    @GetMapping(value = "hello", params = "name")
    public String hello2(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "hello2";
    }

    @GetMapping(value = "hello/{name}")
    public String hello3(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello2";
    }
}
