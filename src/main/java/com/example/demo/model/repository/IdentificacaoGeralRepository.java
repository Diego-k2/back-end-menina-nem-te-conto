package com.example.demo.model.repository;

import com.example.demo.model.entity.IdentificacaoGeral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdentificacaoGeralRepository extends JpaRepository<IdentificacaoGeral, Long> {

    @Query("SELECT i FROM IdentificacaoGeral i WHERE i.email = :email AND i.cpf = :cpf")
    List<IdentificacaoGeral> listaEmailCpf(String email, String cpf);

    @Query("SELECT d from IdentificacaoGeral d WHERE d.email = :email AND d.senha = :senha")
    public IdentificacaoGeral fazerLogin(String email, String senha);

}
