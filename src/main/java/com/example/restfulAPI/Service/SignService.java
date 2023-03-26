package com.example.restfulAPI.Service;

import com.example.restfulAPI.DTO.SignInResultDto;
import com.example.restfulAPI.DTO.SignUpResultDto;

public interface SignService {
    SignUpResultDto signUp(String id, String password, String name, String role);

    SignInResultDto signIn(String id, String password) throws RuntimeException;
}
