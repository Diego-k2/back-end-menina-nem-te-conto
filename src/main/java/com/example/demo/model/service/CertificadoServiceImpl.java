package com.example.demo.model.service;

import com.example.demo.model.entity.Certificados;
import com.example.demo.model.repository.CertificadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CertificadoServiceImpl implements CertificadoService {


    @Autowired CertificadosRepository certificadosRepository;

    @Override
    public Certificados saveCertificado(Certificados certificados) {
        return certificadosRepository.save(certificados);
    }


    @Override
    public Certificados updateCertificados(Certificados certificados, Long id) {

        Certificados atualizaCertificados = certificadosRepository.findById(id).get();

        if(Objects.nonNull(certificados.getNomeCertificado())
        && !"".equalsIgnoreCase(certificados.getNomeCertificado())){
            atualizaCertificados.setNomeCertificado(certificados.getNomeCertificado());
        }

        return certificadosRepository.save(atualizaCertificados);
    }

    @Override
    public void deleteCertificado(Long id) {
        certificadosRepository.deleteById(id);
    }

}
