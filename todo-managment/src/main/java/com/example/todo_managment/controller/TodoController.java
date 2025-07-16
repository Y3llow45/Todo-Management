package com.example.todo_managment.controller;

import com.example.todo_managment.dto.TodoDto;
import com.example.todo_managment.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
@AllArgsConstructor
public class TodoController {
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto) {
        TodoDto createdTodo = todoService.createTodo(todoDto);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<TodoDto> getTodoById(@RequestParam Long id) {
        TodoDto todoDto = todoService.getTodoById(id);
        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }
}
