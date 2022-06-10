package com.gilang.test.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subBagian")
public class subbagian {
    @Id
    @Column(name = "kdSubBag", length = 6)
    private String id;

    @Column(name = "jabatan", length = 60)
    private String jabatan;

    @Column(name = "keterangan", length = 60)
    private String keterangan;

    @ManyToOne
    @JoinColumn(name = "kodeBagian")
    private bagian bagian;

    public subbagian() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public bagian getBagian() {
        return bagian;
    }

    public void setBagian(bagian bagian) {
        this.bagian = bagian;
    }

    
}
