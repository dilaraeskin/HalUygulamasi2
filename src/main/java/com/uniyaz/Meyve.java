package com.uniyaz;

import java.io.Serializable;

public class Meyve extends Urun implements Serializable {

    private static int meyveIdCounter;
    private int urunId;
    private String urunAd;
    private float urunFiyat;
    private int urunMiktar;
    private String urunKategoriBarkod = "M";
    private String barkod = urunKategoriBarkod + meyveIdCounter;



    public Meyve(String meyveAd, float urunFiyat, int urunMiktar) {
        meyveIdCounter++;

        this.urunId=meyveIdCounter;
        this.urunAd = meyveAd;
        this.urunFiyat = urunFiyat;
        this.urunMiktar = urunMiktar;

    }

    public String getUrunBarkod() {
        return barkod;
    }

    public String getUrunAdi() {
        return urunAd;
    }

    public int getMiktar() {
        return urunMiktar;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public static int getMeyveIdCounter() {
        return meyveIdCounter;
    }

    public static void setMeyveIdCounter(int meyveIdCounter) {
        Meyve.meyveIdCounter = meyveIdCounter;
    }


    public String getUrunKategoriBarkod() {
        return urunKategoriBarkod;
    }

    public void setUrunKategoriBarkod(String urunKategoriBarkod) {
        this.urunKategoriBarkod = urunKategoriBarkod;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    @Override
    public float getUrunFiyat() {
        return urunFiyat;
    }

    @Override
    public void setUrunFiyat(float urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public int getUrunMiktar() {
        return urunMiktar;
    }


    @Override
    public int getUrunId() {
        return urunId;
    }

    @Override
    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }
}
