package com.uniyaz;


import java.io.Serializable;
import java.util.List;

public abstract class Urun implements Serializable {

    private static int urunIdCounter;
    private int urunId;
    private float urunFiyat;
    private EnumMiktarTuru urunMiktarTuru;


    public abstract String getUrunAdi();
    public abstract int getMiktar();
    public abstract String getUrunBarkod();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Urun urun = (Urun) o;
        return urunId == urun.urunId ;
    }

    @Override
    public int hashCode() {
        return this.urunId;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public float getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(float urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public EnumMiktarTuru getUrunMiktarTuru() {
        return urunMiktarTuru;
    }

    public void setUrunMiktarTuru(EnumMiktarTuru urunMiktarTuru) {
        this.urunMiktarTuru = urunMiktarTuru;
    }
}
