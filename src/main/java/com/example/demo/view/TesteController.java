package com.example.demo.view;

import com.example.demo.model.entity.FotosIdenGer;
import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.service.FotoIdenGerServiceImpl;
import com.example.demo.model.service.IdentificacaoGeralService;
import com.example.demo.model.service.IdentificacaoGeralServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class TesteController {

    @Autowired
    FotoIdenGerServiceImpl fotoIdenGerService;

    @Autowired
    IdentificacaoGeralServiceImpl identificacaoGeralService;

    @GetMapping("/")
    public String home(ModelMap model) {
        return "home";
    }


   // @PostMapping("/salvaImg")
    //public String salva(ModelMap model, @RequestParam(name = "foto")MultipartFile foto) throws IOException {
//        IdentificacaoGeral identificacaoGeral = new IdentificacaoGeral("Diego","Santos","938","2011/10/01","111", "5454","dieo", "123", "2022/10/01", 1);
//
//        FotosIdenGer fotosIdenGer = new FotosIdenGer(foto.getBytes(), identificacaoGeral );
//
//        identificacaoGeralService.saveDepartment(identificacaoGeral);
//        fotoIdenGerService.saveFotoIdenGer(fotosIdenGer);

      //  return "home";
    //}

    @GetMapping("/cadastrado")
    public String cadastrado(ModelMap model){return "cadastrado";}

}
