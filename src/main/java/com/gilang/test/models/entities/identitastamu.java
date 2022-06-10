package com.gilang.test.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identitasTamu")
public class identitastamu {
    @Id
    @Column(name = "noIdentitas", length = 20)
    private String id;

    @Column(name = "nama", length = 50)
    private String nama;

    @Column(name = "tempatLahir")
    private String tempatLahir;

    @Column(name = "tglLahir")
    private String tglLahir;

    @Column(name = "jenisKelamin")
    private Character jenisKelamin;

    public identitastamu() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public Character getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    
}
