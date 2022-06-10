package com.example.demo.model.service;

import com.example.demo.model.entity.Certificados;

public interface CertificadoService {

    Certificados saveCertificado(Certificados certificados);

    Certificados updateCertificados(Certificados certificados, Long id);

    void deleteCertificado(Long id);




}
