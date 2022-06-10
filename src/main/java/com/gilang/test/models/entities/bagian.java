package com.gilang.test.models.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bagian")
public class bagian{

    @Id
    @Column(name = "kodeBagian", length = 3)
    private String id;

    @Column(length = 60)
    private String namaBagian;

    @Column(length = 60)
    private String keterangan;

    @OneToMany(mappedBy = "bagian",fetch = FetchType.LAZY)
    private Set<subbagian> subbagians = new HashSet<>();

    public bagian() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaBagian() {
        return namaBagian;
    }

    public void setNamaBagian(String namaBagian) {
        this.namaBagian = namaBagian;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Set<subbagian> getSubbagians() {
        return subbagians;
    }

    public void setSubbagians(Set<subbagian> subbagians) {
        this.subbagians = subbagians;
    }

    

}
