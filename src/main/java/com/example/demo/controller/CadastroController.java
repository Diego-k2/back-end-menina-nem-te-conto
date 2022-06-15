package com.example.demo.controller;

import com.example.demo.model.entity.FotosIdenGer;
import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.service.FotoIdenGerServiceImpl;
import com.example.demo.model.service.IdentificacaoGeralServiceImpl;
import com.example.demo.model.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {

    @Autowired private IdentificacaoGeralServiceImpl identificacaoGeralService;

    @Autowired private FotoIdenGerServiceImpl fotoIdenGerService;

    @PostMapping(value = "/cadastrarUser")
    public ModelAndView cadastrarUser(ModelMap model, @RequestParam(value = "nome")String nome,
                                      @RequestParam(value = "sobrenome")String sobrenome,
                                      @RequestParam(value = "cpf")String cpf, @RequestParam(value = "dtNascimento") String dtNascimento,
                                      @RequestParam(value = "telefone")String telefone, @RequestParam(value = "cep") String cep,
                                      @RequestParam(value = "email")String email, @RequestParam(value = "senha") String senha,
                                      @RequestParam(value = "imagemPerfil")MultipartFile imagemPerfil) throws Exception {

        ModelAndView modelAndView = new ModelAndView();

        String dtCadastro = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());

        IdentificacaoGeral identificacaoGeral = new IdentificacaoGeral(nome, sobrenome, cpf, dtNascimento, telefone,
                cep, email, senha, dtCadastro);

        identificacaoGeral.setSenha(Util.md5(identificacaoGeral.getSenha())); //Faz criptografia da senha para o banco

        FotosIdenGer fotosIdenGer = new FotosIdenGer(imagemPerfil.getBytes(), identificacaoGeral);

        if (identificacaoGeralService.listaEmailCpf(email, cpf) == null) {
            identificacaoGeralService.saveDepartment(identificacaoGeral);
            fotoIdenGerService.saveFotoIdenGer(fotosIdenGer);
            modelAndView.setViewName("redirect:/cadastrado");
            return modelAndView;
        }
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

//    @PostMapping(value = "/cadastroFreela")
//    public String cadastrarUser(@RequestParam(value = "nome")String nome,
//                                @RequestParam(value = "sobrenome")String sobrenome,
//                                @RequestParam(value = "cpf")String cpf, @RequestParam(value = "dtNascimento") String dtNascimento,
//                                @RequestParam(value = "telefone")String telefone, @RequestParam(value = "cep") String cep,
//                                @RequestParam(value = "email")String email, @RequestParam(value = "senha") String senha,
//                                @RequestParam(value = "imagemPerfil")MultipartFile imagemPerfil) throws Exception {
//
//
//
//
//        return "";
//
//    }

    //todo IMPLEMENTAR CADASTRO FREELA E VER COMO SALVAR PDF NO BANCO

}