//package com.example.demo.model.service;
//
//import com.example.demo.model.entity.FotosIdenGer;
//import com.example.demo.model.repository.FotosIdenGerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class FotoIdenGerServiceImpl implements FotoIdenGerService{
//
//    @Autowired FotosIdenGerRepository fotosIdenGerRepository;
//
//    @Override
//    public FotosIdenGer saveFotoIdenGer(FotosIdenGer fotosIdenGer) {
//        return fotosIdenGerRepository.save(fotosIdenGer);
//    }
//
//    @Override
//    public FotosIdenGer upDateFotoIdenGer(FotosIdenGer fotosIdenGer, Long id) {
//
//        FotosIdenGer atualizaFotosIdenGer = fotosIdenGerRepository.findById(id).get();
//        return null;
//    }
//
//
//    @Override
//    public void deleteFotoIdenGer(Long id) {
//
//    }
//}
