package com.example.demo.controller;

import com.example.demo.model.entity.Newsletter;
import com.example.demo.model.repository.NewsletterRepository;
import com.example.demo.model.service.NewsletterService;
import com.example.demo.model.service.NewsletterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@RestController
@RequestMapping(value = "/sendMail")

public class SenderMailController {

    @Autowired private JavaMailSender mailSender;

    @Autowired private NewsletterService newsletterService;

    @Autowired private NewsletterServiceImpl newsletterRepository;

    @RequestMapping(path = "/newsletter", method = RequestMethod.POST)
    public String newsLetter(ModelMap model, @RequestParam(value = "email")String email, @RequestParam(value = "nome")String nome) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("A equipe do menina nem te conto agradece sua inscrição em nosso newsletter");
        message.setFrom("meninanemtecontogp11@outlook.com");
        message.setTo(email);
        message.setSubject("Obrigado por se inscrever em nosso NewsLetter");
        String horaAtual = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        Newsletter newsletter = new Newsletter(email, nome, horaAtual);

        try {
            mailSender.send(message);
            if(newsletterRepository.listaNewsletterCadastrado(email) == null){
                newsletterService.saveNewsletter(newsletter);
            }
            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email.";
        }

    }

    @RequestMapping(path = "/faleconosco", method = RequestMethod.POST)
    public String faleConosco(@RequestParam( value = "nome") String nome, @RequestParam(value = "email") String email,
                              @RequestParam(value = "mensagem") String mensagem){
        String horaAtual = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                .format(Calendar.getInstance().getTime());

        SimpleMailMessage message = new SimpleMailMessage();
        String toMensagem = "NOME: " + nome + "\nE-MAIL: " + email +
                "\nMENSAGEM: " + mensagem + "\nDATA E HORA: " + horaAtual;

        message.setFrom("meninanemtecontogp11@outlook.com");
        message.setTo("meninanemtecontogp11@outlook.com");
        message.setSubject("FALE CONOSCO !!!");

        message.setText(toMensagem);

        try {
            mailSender.send(message);
        } catch (Exception e){
            e.printStackTrace();
        }

      return "";
    }



}


