package com.example.demo.controller;

import com.example.demo.model.entity.CategoriaCursos;
import com.example.demo.model.entity.Cursos;
import com.example.demo.model.service.CursosCategoriasServiceImpl;
import com.example.demo.model.service.CursosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/cursos")
public class ControllerCursos {

    @Autowired private CursosServiceImpl cursosService;
    @Autowired private CursosCategoriasServiceImpl cursosCategoriasService;

    @RequestMapping(value = "/novoCurso", method = RequestMethod.POST)
    public Cursos salvaCurso(@RequestParam(value = "nomeCurso") String nomeCurso, @RequestParam(value = "instituicao") String instituicao,
                             @RequestParam(value = "valor") String valor, @RequestParam(value = "tipo_formacao") String formacao,
                             @RequestParam(value = "nome_cate") String categoria){

        CategoriaCursos categoriaCursos = new CategoriaCursos(categoria);
        Cursos curso = new Cursos(nomeCurso, instituicao, valor, formacao, categoriaCursos);

        cursosCategoriasService.saveCategoriasCursos(categoriaCursos);
        return cursosService.saveNewCurso(curso);
    }

    @RequestMapping(value = "/userView/mostraCursos", method = RequestMethod.GET)
    public List<Cursos> vizualizaCursos(){
        return cursosService.fetchCursosList();
    }



}
