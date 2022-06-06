package com.example.demo.service;

import com.example.demo.entity.Cursos;
import com.example.demo.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CursosServiceImpl implements CursosService{

    @Autowired CursosRepository cursosRepository;

    @Override
    public Cursos saveNewCurso(Cursos curso) {
        return cursosRepository.save(curso);
    }

    @Override
    public List<Cursos> fetchCursosList() {
        return cursosRepository.findAll();
    }

    @Override
    public void deleteCursoById(Long cursoId) {
        cursosRepository.deleteById(cursoId);
    }
}
