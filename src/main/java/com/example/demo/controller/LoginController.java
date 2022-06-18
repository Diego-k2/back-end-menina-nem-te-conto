package com.example.demo.controller;

import com.example.demo.model.entity.HistoricoLogin;
import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.repository.IdentificacaoGeralRepository;
import com.example.demo.model.service.HistoricoLoginServiceImpl;
import com.example.demo.model.service.IdentificacaoGeralServiceImpl;

import com.example.demo.model.util.Util;
import com.sun.mail.util.logging.CollectorFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Id;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.UIResource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Anotação
@RestController
@RequestMapping("/auth")
public class LoginController {

   @Autowired IdentificacaoGeralServiceImpl identificacaoGeralService;

   @Autowired HistoricoLoginServiceImpl historicoLoginService;


   @PostMapping("/login")
        public Object login(@ModelAttribute(value = "email")String email, @ModelAttribute(value = "senha")String senha,
                        BindingResult bindingResult, HttpSession httpSession) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        String dtLogin = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());

        IdentificacaoGeral identificacaoGeral = identificacaoGeralService.findByEmailAndLogin(email, Util.md5(senha));



       if(identificacaoGeral == null) {
            return "Conta nao existe";
        }else {
                HistoricoLogin historicoLogin = new HistoricoLogin(dtLogin , identificacaoGeral);
                httpSession.setAttribute("userMail", identificacaoGeral.getEmail());
                historicoLoginService.saveLogin(historicoLogin);
                return  httpSession.getAttribute("userMail");
//              return "Deu certo";
        }

   }






    @GetMapping("/teste")
    public Object teste(HttpSession request){

        return request.getAttribute("userMail");
   }

    @PostMapping("/logout")
    public String logout(HttpSession request){
       request.invalidate();
       return "Sessão fechada";
    }


}