package com.example.demo.model.service;

import com.example.demo.model.entity.IdentificacaoGeral;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IdentificacaoGeralService {

    IdentificacaoGeral saveDepartment(IdentificacaoGeral department);

    List<IdentificacaoGeral> listaPerfisContratantes();

    IdentificacaoGeral updateIdentificacaoGeral(IdentificacaoGeral identificacaoGeral);

    List<IdentificacaoGeral> listaEmailCpf(String email, String cpf);

    IdentificacaoGeral fazLogin(String email, String senha);

    void deleteIdentificacaoGeralById(long identificacaoGeralid);


}
