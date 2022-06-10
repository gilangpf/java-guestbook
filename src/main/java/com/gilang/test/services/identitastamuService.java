package com.gilang.test.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilang.test.models.repos.identitastamuRepo;
import com.gilang.test.models.entities.identitastamu;

@Service
@Transactional
public class identitastamuService {

    @Autowired
    private identitastamuRepo identitastamuRepo;
    
    public identitastamu save(identitastamu identitastamu){
        return identitastamuRepo.save(identitastamu);
    }

    public Iterable<identitastamu> findAll(){
        return identitastamuRepo.findAll();
    }

    public identitastamu findOne(String id){
        return identitastamuRepo.findById(id).get();
    }

    public void removeOne(String id){
        identitastamuRepo.deleteById(id);
    }
}