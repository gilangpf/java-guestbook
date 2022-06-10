package com.gilang.test.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tiketTamu")
public class tikettamu {
    @Id
    @Column(name = "noTiket", length = 22)
    private String id;

    public tikettamu() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
