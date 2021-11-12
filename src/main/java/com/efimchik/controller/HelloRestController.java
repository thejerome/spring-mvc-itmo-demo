package com.efimchik.controller;

import com.efimchik.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class HelloRestController {

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
    public Person hello3(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        final Person person = new Person();
        person.setId(1);
        person.setName("Max Pain");
        return person;
    }
}
