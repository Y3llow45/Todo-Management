package com.example.todo_managment.service.impl;

import com.example.todo_managment.dto.TodoDto;
import com.example.todo_managment.entity.Todo;
import com.example.todo_managment.mapper.TodoMapper;
import com.example.todo_managment.repository.TodoRepository;
import com.example.todo_managment.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public abstract class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Override
    public TodoDto createTodo(TodoDto todoDto) {
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        Todo savedTodo = todoRepository.save(todo);
        return TodoMapper.mapToTodoDto(savedTodo);
    }
}
