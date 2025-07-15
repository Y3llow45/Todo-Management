package com.example.todo_managment.mapper;

import com.example.todo_managment.dto.TodoDto;
import com.example.todo_managment.entity.Todo;

public class TodoMapper {
    public static TodoDto mapToTodoDto(Todo todo) {
        return new TodoDto(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription(),
                todo.isCompleted()
        );
    }

    public static Todo mapToTodo(TodoDto dto) {
        return new Todo(
                dto.getId(),
                dto.getTitle(),
                dto.getDescription(),
                dto.isCompleted()
        );
    }
}
