package com.example.demo.repository;

import com.example.demo.entity.CategoriaCursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosCategoriaRepository extends JpaRepository<CategoriaCursos, Long> {
}
