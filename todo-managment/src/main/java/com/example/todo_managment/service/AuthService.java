package com.example.todo_managment.service;

import com.example.todo_managment.dto.LoginDto;
import com.example.todo_managment.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    String login(LoginDto loginDto);
}
