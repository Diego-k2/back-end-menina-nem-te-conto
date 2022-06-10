package com.example.demo.model.service;

import com.example.demo.model.entity.CadastroFreelas;

public interface CadastroFreelaService {



    CadastroFreelas saveCadastroFreela(CadastroFreelas cadastroFreelas);

    CadastroFreelas updateCadastroFreela(CadastroFreelas cadastroFreelas, Long id);

    void deleteCadastroFreela(Long id);

}
