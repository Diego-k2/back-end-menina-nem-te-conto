package com.example.demo.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {

    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("nomeDoAtributo", "Treinaweb");
        model.addAttribute("diego", "Diego Gato");
        return "home";
    }
}
