package com.example.demo.model.service;

import com.example.demo.model.entity.IdentificacaoGeral;

import java.util.List;

public interface IdentificacaoGeralService {

    IdentificacaoGeral saveDepartment(IdentificacaoGeral department);

    List<IdentificacaoGeral> listaPerfisContratantes();

    void deleteIdentificacaoGeralById(long identificacaoGeralid);


}
