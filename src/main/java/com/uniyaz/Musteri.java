package com.uniyaz;


import java.io.Serializable;

public class Musteri implements Serializable {


    private  int musteriId;
    private String musteriAd;

    public Musteri(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musteri musteri = (Musteri) o;
        return musteriId == musteri.musteriId;
    }

    @Override
    public int hashCode() {
        return musteriId;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }
}
