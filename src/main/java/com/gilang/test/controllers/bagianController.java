package com.gilang.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilang.test.models.entities.bagian;
import com.gilang.test.services.bagianService;

@RestController
@RequestMapping("/bagian")
public class bagianController {
    @Autowired
    private bagianService bagianService;

    @PostMapping
    public bagian save(@RequestBody bagian bagian){
        return bagianService.save(bagian);
    }

    @GetMapping
    public Iterable<bagian> findAll(){
        return bagianService.findAll();
    }
}
