package com.uniyaz;

import java.io.*;
import java.util.List;

public class Satis implements Serializable {

    Musteri musteri;
    Urun urun;
    private int kacAdet;
    private String urunAd;
    private int kalanAdet;



    public void musteriListEkle(Satis satis,List<Satis> satisList){
        satisList.add(satis);

    }
    public void urunMiktarDegisimi(List<Stok> stokList) {
        try {
        for (Stok stokUrun : stokList) {      //***********Bu for döngüsü ürün adı listede varsa urunAdını yazdırıyor.
            if (stokUrun.getUrun().getUrunAdi().equals(urunAd)) {
                kalanAdet=stokUrun.getUrun().getMiktar();
                kalanAdet = kalanAdet-kacAdet;

            }
        }    }
        catch(NullPointerException e){
                System.out.println("Listeniz boş Lütfen listeyi doldurunuz");
            }

        }

    public void urunListele(List<Satis> satisList){
        try {

            for (Satis stokUrun : satisList) {
                System.out.println("\nMüşteri Adı=" +musteri.getMusteriAd() + "\t\t" + "\t\t" +
                        "Ürün Adı=" + stokUrun.getUrunAd()  +
                        "\t\t" + "Satlan Adet=" + kacAdet
                );
            }
        }
        catch(NullPointerException e){
                    System.out.println("Listeniz boştur");
            }

        }
    public static void satislariDosyayaObjeOlarakYaz(List<Satis> satisList){

        try(FileOutputStream fileOut=new FileOutputStream(".\\Txt\\Musteri.txt");
            ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);) {
            objectOut.writeObject(satisList);
            System.out.println("The Object was succes");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
    public static List<Satis> satislariDosyadanOku(){
        List<Satis> satisList=null;

        try(FileInputStream fileIn=new FileInputStream(".\\Txt\\Musteri.txt");
            ObjectInputStream objectIn=new ObjectInputStream(fileIn);) {
            satisList=(List<Satis>) objectIn.readObject();
            System.out.println("The Object was succes");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return satisList;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public void setKacAdet(int kacAdet) {
        this.kacAdet = kacAdet;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public int getKacAdet() {
        return kacAdet;
    }

    public int getKalanAdet() {
        return kalanAdet;
    }

    public void setKalanAdet(int kalanAdet) {
        this.kalanAdet = kalanAdet;
    }


}
