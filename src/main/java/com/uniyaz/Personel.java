package com.uniyaz;

import java.io.Serializable;

public class Personel implements Serializable {

    private static int personelIdCounter;
    private int personelId;
    private String personelAd;


    public Personel( String personelAd) {
        personelIdCounter++;
        this.personelId = personelIdCounter;
        this.personelAd = personelAd;
    }

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public String getPersonelAd() {
        return personelAd;
    }

    public void setPersonelAd(String personelAd) {
        this.personelAd = this.personelAd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personel personel = (Personel) o;
        return personelId == personel.personelId;
    }

    @Override
    public int hashCode() {

        return personelId;
    }
}
