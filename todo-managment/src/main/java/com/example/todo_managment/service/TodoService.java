package com.example.todo_managment.service;

import com.example.todo_managment.dto.TodoDto;
import com.example.todo_managment.entity.Todo;
import com.example.todo_managment.service.impl.TodoServiceImpl;

public interface TodoService{
    TodoDto createTodo(TodoDto todoDto);
}
