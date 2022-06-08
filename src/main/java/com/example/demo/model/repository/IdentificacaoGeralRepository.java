package com.example.demo.model.repository;

import com.example.demo.model.entity.IdentificacaoGeral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentificacaoGeralRepository extends JpaRepository<IdentificacaoGeral, Long> {
}
