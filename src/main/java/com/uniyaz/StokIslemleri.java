package com.uniyaz;

import java.io.*;
import java.util.List;

public class StokIslemleri {


Urun urun;



    public void stokUrunEkle(Stok stok, List<Stok> stokList) {
     /*  try {
           for (Stok stokUrun : stokList) {      //***********Bu for döngüsü ürün adı listede varsa miktar arttır adı yoksa urunAdını yazdırıyor.
               if (stokUrun.getUrun().getUrunAdi().equals(urunAd)) {
                   kacAdet=getUrun().getMiktar();
                   miktar = stokUrun.getUrun().getMiktar() + kacAdet;

               }
           }
       }
        catch(Exception e)
           {
            System.out.println("Ürün karşılaştırma yapılamadı");;

        }*/

     stokList.add(stok);
    }


    public void urunListele(List<Stok> stokList) {
        for (Stok stokUrun : stokList) {
            System.out.println("\nPersonelAdı=" + stokUrun.getPersonel().getPersonelAd() + "\t\t" + "Ürün Id=" + stokUrun.getUrun().getUrunBarkod() + "\t\t" +
                    "Ürün Adı=" + stokUrun.getUrun().getUrunAdi() + "\t\t" + "Ürün Fiyatı=" + stokUrun.getToplamMaliyet() +
                    "\t\t" + "Urun Miktarı=" + stokUrun.getUrun().getMiktar() +
                    "\t\t" + "Urun Miktarı Türü=" + stokUrun.getUrun().getUrunMiktarTuru());
        }
    }   //Stok görüntülerken personel ismi görülsün diye koyuldu.

    public void satisListele(List<Stok> stokList) {
        for (Stok stokUrun : stokList) {
            System.out.println("\nÜrün Id=" + stokUrun.getUrun().getUrunBarkod() + "\t\t" +
                    "Ürün Adı=" + stokUrun.getUrun().getUrunAdi() + "\t\t" + "Ürün Fiyatı=" + stokUrun.getToplamMaliyet() +
                    "\t\t" + "Urun Miktarı=" + stokUrun.getUrun().getMiktar() +
                    "\t\t" + "Urun Miktarı Türü=" + stokUrun.getUrun().getUrunMiktarTuru());
        }
    }
    public int getMiktar() {
        return getUrun().getMiktar();
    }

    public static void stoklarıDosyayaObjeOlarakYaz(List<Stok> stokList) {

        try (FileOutputStream fileOut = new FileOutputStream(".\\Txt\\Personel.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);) {
            objectOut.writeObject(stokList);
            System.out.println("The Object was succes");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static List<Stok> stoklarıDosyadanOku() {
        List<Stok> stokList = null;

        try (FileInputStream fileIn = new FileInputStream(".\\Txt\\Personel.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn);) {
            stokList = (List<Stok>) objectIn.readObject();
            System.out.println("The Object was succes");


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return stokList;
    }


    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }
}
