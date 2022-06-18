package com.example.demo.model.repository;

import com.example.demo.model.entity.IdentificacaoGeral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface IdentificacaoGeralRepository extends JpaRepository<IdentificacaoGeral, Long> {


    List<IdentificacaoGeral> findByEmail(String email);

    List<IdentificacaoGeral> findByCpf(String cpf);

    @Query("SELECT d from IdentificacaoGeral d WHERE d.email = :email AND d.senha = :senha")
    IdentificacaoGeral fazerLogin(String email, String senha);



}
