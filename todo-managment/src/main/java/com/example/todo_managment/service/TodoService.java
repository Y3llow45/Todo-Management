package com.example.todo_managment.service;

import com.example.todo_managment.dto.TodoDto;

public interface TodoService{
    TodoDto createTodo(TodoDto todoDto);
    TodoDto getTodoById(Long id);
}
