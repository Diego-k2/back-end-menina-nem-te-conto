package com.example.demo.service;

import com.example.demo.entity.CategoriaCursos;
import com.example.demo.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface CursosCategoriasService {

    public CategoriaCursos saveCategoriasCursos(CategoriaCursos categoriaCursos);

}
