package com.gilang.test.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilang.test.models.entities.tikettamu;
import com.gilang.test.models.repos.tikettamuRepo;

@Service
@Transactional
public class tikettamuService {

    @Autowired
    private tikettamuRepo tikettamuRepo;
    
    public tikettamu save(tikettamu tikettamu){
        return tikettamuRepo.save(tikettamu);
    }

    public Iterable<tikettamu> findAll(){
        return tikettamuRepo.findAll();
    }

    public tikettamu findOne(String id){
        return tikettamuRepo.findById(id).get();
    }

    public void removeOne(String id){
        tikettamuRepo.deleteById(id);
    }
}