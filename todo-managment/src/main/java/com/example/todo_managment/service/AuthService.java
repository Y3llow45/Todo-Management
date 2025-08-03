package com.example.todo_managment.service;

import com.example.todo_managment.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
}
