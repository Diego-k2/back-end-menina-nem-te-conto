package com.example.demo.controller;

import com.example.demo.model.entity.Login;
import com.example.demo.model.service.LoginService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Anotação
@RestController
public class LoginController {

    @Autowired private LoginService loginService;

    // Operação de Salvamento
    @PostMapping("/login")
    public Login saveLogin(
            @RequestBody Login login)
    {
        return loginService.saveLogin(login);
    }

    // Operação de Leitura
    @GetMapping("/login")
    public List<Login> fetchLoginList()
    {
        return loginService.fetchLoginList();
    }


    // Operação de Delet
    @DeleteMapping("/login/{id}")
    public String deleteLoginById(@PathVariable("id")
                                       Long loginId)
    {
        loginService.deleteLoginById(
                loginId);
        return "Deleted Successfully";
    }
}