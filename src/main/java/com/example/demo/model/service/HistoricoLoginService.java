package com.example.demo.model.service;

import com.example.demo.model.entity.HistoricoLogin;

import java.util.List;

public interface HistoricoLoginService {

    HistoricoLogin historicoLogin(HistoricoLogin historicoLogin);

    List<HistoricoLogin> historicoLoginList();

}
