package com.example.demo.model.service;

import com.example.demo.model.entity.Login;
import com.example.demo.model.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Login saveLogin(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public List<Login> fetchLoginList() {
        return loginRepository.findAll();
    }

    @Override
    public void deleteLoginById(Long loginId) {
        loginRepository.deleteById(loginId);
    }
}