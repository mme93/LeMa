package de.LeMa.rest.service;

import de.LeMa.rest.model.TodoDto;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    public TodoDto getTodo (){
        TodoDto todo = new TodoDto();
         todo.setToDo("Ich bin ein Todo");
        return new TodoDto("Hausaufgaben erledigen");
    }
}
