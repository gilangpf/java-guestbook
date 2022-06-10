package com.gilang.test.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilang.test.models.entities.tiketantrean;
import com.gilang.test.models.repos.tiketantreanRepo;

@Service
@Transactional
public class tiketantreanService {

    @Autowired
    private tiketantreanRepo tiketantreanRepo;
    
    public tiketantrean save(tiketantrean tiketantrean){
        return tiketantreanRepo.save(tiketantrean);
    }

    public Iterable<tiketantrean> findAll(){
        return tiketantreanRepo.findAll();
    }

    public tiketantrean findOne(String id){
        return tiketantreanRepo.findById(id).get();
    }

    public void removeOne(String id){
        tiketantreanRepo.deleteById(id);
    }
}