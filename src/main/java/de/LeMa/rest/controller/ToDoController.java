package de.LeMa.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Todo")
public class ToDoController {
    @GetMapping("/")
    public String getTodo(){
        return "Ich bin ein Todo";
    }
}
