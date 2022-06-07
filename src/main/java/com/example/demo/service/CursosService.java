package com.example.demo.service;

import com.example.demo.entity.Cursos;
import com.example.demo.entity.Newsletter;

import java.util.List;

public interface CursosService {

    Cursos saveNewCurso  (Cursos curso);

    List<Cursos> fetchCursosList();

    void deleteCursoById(Long newsletterId);

}
