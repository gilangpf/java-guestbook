package com.gilang.test.models.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gilang.test.models.entities.bagian;

@Repository
public interface bagianRepo extends CrudRepository<bagian, String>{
    
}
