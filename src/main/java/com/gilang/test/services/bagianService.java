package com.gilang.test.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilang.test.models.entities.bagian;
import com.gilang.test.models.repos.bagianRepo;

@Service
@Transactional
public class bagianService {
    
    @Autowired
    private bagianRepo bagianRepo;

    public bagian save(bagian bagian){
        return bagianRepo.save(bagian);
    } 

    public Iterable<bagian> findAll(){
        return bagianRepo.findAll();
    }

    public bagian findOne(String id){
        return bagianRepo.findById(id).get();
    }

    public void removeOne(String id){
        bagianRepo.deleteById(id);
    }
}
