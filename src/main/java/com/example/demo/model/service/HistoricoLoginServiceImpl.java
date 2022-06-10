package com.example.demo.model.service;

import com.example.demo.model.entity.HistoricoLogin;
import com.example.demo.model.repository.HistoricoLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class HistoricoLoginServiceImpl implements HistoricoLoginService {

    @Autowired HistoricoLoginRepository historicoLoginRepository;

    @Override
    public HistoricoLogin historicoLogin(HistoricoLogin historicoLogin) {
        return historicoLoginRepository.save(historicoLogin);
    }

}
