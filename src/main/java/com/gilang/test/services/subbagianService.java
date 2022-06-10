package com.gilang.test.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilang.test.models.entities.subbagian;
import com.gilang.test.models.repos.subbagianRepo;

@Service
@Transactional
public class subbagianService {

    @Autowired
    private subbagianRepo subbagianRepo;
    
    public subbagian save(subbagian subbagian){
        return subbagianRepo.save(subbagian);
    }

    public Iterable<subbagian> findAll(){
        return subbagianRepo.findAll();
    }

    public subbagian findOne(String id){
        return subbagianRepo.findById(id).get();
    }

    public void removeOne(String id){
        subbagianRepo.deleteById(id);
    }
}
