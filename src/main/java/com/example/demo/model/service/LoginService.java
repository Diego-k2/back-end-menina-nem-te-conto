package com.example.demo.model.service;

import com.example.demo.model.entity.Login;

import java.util.List;

public interface LoginService {
    Login saveLogin(Login login);

    List<Login> fetchLoginList();

    void deleteLoginById(Long loginId);
}
