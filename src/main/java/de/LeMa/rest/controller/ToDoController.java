package de.LeMa.rest.controller;

import de.LeMa.rest.model.TodoDto;
import de.LeMa.rest.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Todo")
public class ToDoController {

    private final ToDoService todoService;
@Autowired
    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public TodoDto getTodo(){
        return this.todoService.getTodo();
    }
}
