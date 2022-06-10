package com.gilang.test.models.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gilang.test.models.entities.identitastamu;

@Repository
public interface identitastamuRepo extends CrudRepository<identitastamu, String>{
    
}
