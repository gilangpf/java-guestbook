package com.gilang.test.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tiketAntrean")
public class tiketantrean {
    @Id
    @Column(name = "noTiket", length = 10)
    private String id;

    @Column(name = "tglBuatTiket", length = 25)
    private Date tglBuatTiket;
    
    @Column(name = "statusTiket")
    private Character statusTiket;

    @Column(name = "statusCetak")
    private Character statusCetak;

    public tiketantrean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTglBuatTiket() {
        return tglBuatTiket;
    }

    public void setTglBuatTiket(Date tglBuatTiket) {
        this.tglBuatTiket = tglBuatTiket;
    }

    public Character getStatusTiket() {
        return statusTiket;
    }

    public void setStatusTiket(Character statusTiket) {
        this.statusTiket = statusTiket;
    }

    public Character getStatusCetak() {
        return statusCetak;
    }

    public void setStatusCetak(Character statusCetak) {
        this.statusCetak = statusCetak;
    }

    
}
