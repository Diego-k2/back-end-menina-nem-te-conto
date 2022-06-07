package com.example.demo.service;

import com.example.demo.entity.CategoriaCursos;
import com.example.demo.entity.Cursos;
import com.example.demo.repository.CursosCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursosCategoriasServiceImpl implements CursosCategoriasService {

    @Autowired
    private CursosCategoriaRepository cursosCategoriaRepository;


    @Override
    public CategoriaCursos saveCategoriasCursos(CategoriaCursos categoriaCursos) {
        return cursosCategoriaRepository.save(categoriaCursos);
    }
}
