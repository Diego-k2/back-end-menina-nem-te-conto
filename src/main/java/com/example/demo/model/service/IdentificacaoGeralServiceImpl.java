package com.example.demo.model.service;

import com.example.demo.model.entity.IdentificacaoGeral;
import com.example.demo.model.repository.IdentificacaoGeralRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IdentificacaoGeralServiceImpl implements IdentificacaoGeralService {


    @Autowired
    private IdentificacaoGeralRepository identificacaoGeralRepository;

    @Override
    public IdentificacaoGeral saveDepartment(IdentificacaoGeral identificacaoGeral) {return identificacaoGeralRepository.save(identificacaoGeral);}

    @Override
    public List<IdentificacaoGeral> listaPerfisContratantes() {return identificacaoGeralRepository.findAll();}

    @Override
    public void deleteIdentificacaoGeralById(long identificacaoGeralid) {identificacaoGeralRepository.deleteById(identificacaoGeralid);}
}
