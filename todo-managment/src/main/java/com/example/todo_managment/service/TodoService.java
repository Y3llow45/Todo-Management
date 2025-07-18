package com.example.todo_managment.service;

import com.example.todo_managment.dto.TodoDto;

import java.util.List;

public interface TodoService{
    TodoDto createTodo(TodoDto todoDto);
    TodoDto getTodoById(Long id);
    List<TodoDto> getAllTodos();
    TodoDto updateTodo(Long id, TodoDto todoDto);
    TodoDto setCompleted(Long id);
    void deleteTodo(Long id);
}
