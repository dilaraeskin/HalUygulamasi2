package com.uniyaz;

import java.io.Serializable;

public class Sebze extends Urun implements Serializable {

    private static int sebzeIdCounter;

    private int urunId;
    private String urunAd;
    private float urunFiyat;
    private int urunMiktar;
    private String urunKategoriBarkod="S";
    private String barkod=urunKategoriBarkod+sebzeIdCounter;


    public Sebze(String sebzeAd,float urunFiyat,int urunMiktar) {
        sebzeIdCounter++;

        this.urunId=sebzeIdCounter;
        this.urunAd = sebzeAd;
        this.urunFiyat=urunFiyat;
        this.urunMiktar=urunMiktar;



    }

    public String getUrunAdi() {

        return urunAd;
    }
    public int getMiktar() {
        return urunMiktar;
    }
    public String getUrunBarkod(){
        return barkod;
    }



    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public static int getSebzeIdCounter() {
        return sebzeIdCounter;
    }

    public static void setSebzeIdCounter(int sebzeIdCounter) {
        Sebze.sebzeIdCounter = sebzeIdCounter;
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

    public void setUrunMiktar(int urunMiktar) {
        this.urunMiktar = urunMiktar;
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
