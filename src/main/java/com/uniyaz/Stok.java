package com.uniyaz;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.Serializable;
import java.util.List;


public class Stok implements Serializable {

    Personel personel;
    private Urun urun;
 //   private int miktar;



    public float getToplamMaliyet(){

        int miktar=getUrun().getMiktar();
        miktar=getUrun().getMiktar();
        return miktar*getUrun().getUrunFiyat();
    }


    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getMiktar() {
        return getUrun().getMiktar();
    }



    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }


}
