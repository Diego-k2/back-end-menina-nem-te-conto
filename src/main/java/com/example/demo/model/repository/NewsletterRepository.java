package com.example.demo.model.repository;


import com.example.demo.model.entity.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsletterRepository extends JpaRepository<Newsletter, Long> {

    @Query("SELECT i FROM Newsletter i WHERE i.email = :email")
    List<Newsletter> listaNewsletterCadastrado(String email);
}
