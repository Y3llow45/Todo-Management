package com.example.todo_managment.controller;

import com.example.todo_managment.dto.TodoDto;
import com.example.todo_managment.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(params = "id")
    public ResponseEntity<TodoDto> getTodoById(@RequestParam Long id) {
        TodoDto todoDto = todoService.getTodoById(id);
        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos() {
        List<TodoDto> todos = todoService.getAllTodos();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    @PutMapping(params = "id")
    public ResponseEntity<TodoDto> updateTodo(@RequestParam Long id, @RequestBody TodoDto todoDto) {
        TodoDto updatedTodo = todoService.updateTodo(id, todoDto);
        return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteTodo(@RequestParam Long id) {
        todoService.deleteTodo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("{id}/completed")
    public ResponseEntity<TodoDto> setCompleted(@PathVariable("id") Long id) {
        TodoDto completedTodo = todoService.setCompleted(id);
        return new ResponseEntity<>(completedTodo, HttpStatus.OK);
    }

    @PatchMapping("{id}/in-completed")
    public ResponseEntity<TodoDto> setIncompleted(@PathVariable("id") Long id) {
        TodoDto completedTodo = todoService.setIncompleted(id);
        return new ResponseEntity<>(completedTodo, HttpStatus.OK);
    }
}
