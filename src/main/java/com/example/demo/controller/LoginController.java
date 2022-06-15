package com.example.demo.controller;

import com.example.demo.model.entity.HistoricoLogin;
import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.service.HistoricoLoginServiceImpl;
import com.example.demo.model.service.IdentificacaoGeralServiceImpl;

import com.example.demo.model.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Anotação
@RestController
@RequestMapping("/auth")
public class LoginController {

   @Autowired IdentificacaoGeralServiceImpl identificacaoGeralService;

   @Autowired HistoricoLoginServiceImpl historicoLoginService;

   @PostMapping("/login")
    public String login(@ModelAttribute(value = "email")String email, @ModelAttribute(value = "senha")String senha,
                        BindingResult bindingResult, HttpSession httpSession) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        String dtLogin = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());

        IdentificacaoGeral identificacaoGeral = identificacaoGeralService.fazLogin(email, Util.md5(senha));
        if(identificacaoGeral == null) {
            return "Conta nao existe";
        }else {
            HistoricoLogin historicoLogin = new HistoricoLogin(dtLogin, identificacaoGeral);
            httpSession.setAttribute("user", identificacaoGeral);
            historicoLoginService.saveLogin(historicoLogin);
            return httpSession.getAttribute("user").toString();
        }

   }

    @GetMapping("/teste")
    public String teste(HttpSession request){
        IdentificacaoGeral iden = (IdentificacaoGeral) request.getAttribute("user");
        return iden.getCpf();
   }

    @PostMapping("/logout")
    public String logout(HttpSession request){
       request.invalidate();
       return "Sessão fechada";
    }


}