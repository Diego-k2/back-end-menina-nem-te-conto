package com.example.demo.model.repository;

import com.example.demo.model.entity.FotosIdenGer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotosIdenGerRepository extends JpaRepository<FotosIdenGer, Long> {
}
