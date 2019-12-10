package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Stok> stokList = new ArrayList();
    static List<Satis> satisList = new ArrayList();

    public static void main(String[] args) {



        StokIslemleri stokIslemleri=new StokIslemleri();
        Satis satis = new Satis();




        Scanner urunScanner = new Scanner(System.in);
        Scanner personelScanner = new Scanner(System.in);
        Scanner musteriScanner = new Scanner(System.in);
        Scanner kacAdetScanner = new Scanner(System.in);
        Scanner urunAdScanner=new Scanner(System.in);


        while (true) {

            menuGetir();

            int secim = urunScanner.nextInt();

            if (secim == 1) {
                System.out.println("\n******************MEYVE EKLE İŞLEMİ******************");
                System.out.println("\n");
                urunScanner.nextLine();

                Urun urun = meyveScannerOku(urunScanner);

                miktarTuruYazdirDongu(urun);

                Stok stok = new Stok();
                stok.setUrun(urun);
                satis.setUrun(urun);


                Personel personel = personelScannerOku(personelScanner);
                stok.setPersonel(personel);

                //         stok.urunMiktarDegisimi(stokList);
                stokIslemleri.stokUrunEkle(stok, stokList);
                stokIslemleri.stoklarıDosyayaObjeOlarakYaz(stokList);


            } else if (secim == 2) {
                System.out.println("\n******************SEBZE EKLE İŞLEMİ******************");
                System.out.println("\n");
                urunScanner.nextLine();

                Urun urun = sebzeScannerOku(urunScanner);
                miktarTuruYazdirDongu(urun);

                Stok stok = new Stok();
                stok.setUrun(urun);
                satis.setUrun(urun);

                Personel personel = personelScannerOku(personelScanner);
                stok.setPersonel(personel);

     //           stok.urunMiktarDegisimi(stokList);
                stokIslemleri.stokUrunEkle(stok, stokList);
               stokIslemleri.stoklarıDosyayaObjeOlarakYaz(stokList);



            } else if (secim == 3) {
                Satis satis1 = new Satis();
                StokIslemleri stokIslemleri1=new StokIslemleri();

                System.out.println("Satmak istediğiniz ürünü seçin");
                stokIslemleri.satisListele(stokList);


                Musteri musteri = musteriScannerOku(musteriScanner);
                satis1.setMusteri(musteri);

                //Buraya müşteri ürün kodunu girecek*****************************

                System.out.println("Satmak istediğiniz ürünü giriniz");

                String urunAd= urunAdScanner.nextLine();

                satis1.setUrunAd(urunAd);


                System.out.println("Kaç adet satmak istersiniz?");
                int kacAdet = kacAdetScanner.nextInt();

                satis1.setKacAdet(kacAdet);

                satis1.musteriListEkle(satis1, satisList);
                satis.satislariDosyayaObjeOlarakYaz(satisList);
                   satisList=satis.satislariDosyadanOku();
                satis1.urunMiktarDegisimi(stokList);
                satis1.urunListele(satisList);


            } else if (secim == 4) {

                stokList=stokIslemleri.stoklarıDosyadanOku();
                stokIslemleri.urunListele(stokList);

            } else if (secim == 5) {

                System.out.println("ÇIKIŞ");
                break;
            }
        }

    }


    public static void menuGetir() {
        System.out.println("\n*********************STOK UYGULAMASI*********************");
        System.out.println("\n");
        System.out.println("1-Meyve Ekle");
        System.out.println("2-Sebze Ekle");
        System.out.println("3-Satış Menüsü(Satmak istenilen menü için)");
        System.out.println("4-Son Stok Durumu Listele");
        System.out.println("5-Çıkış");

        System.out.println("\nHangi işlem ile devam etmek istiyorsunuz?");
    }

    public static Urun meyveScannerOku(Scanner urunScanner) {


        System.out.println("Ürünün ismini giriniz.");
        String meyveAd = urunScanner.nextLine();


        System.out.println("Ürünün fiyatını giriniz.");
        float urunFiyat = urunScanner.nextFloat();

        System.out.println("Ürünün miktarını giriniz.");
        int urunMiktar = urunScanner.nextInt();


        Urun urun = new Meyve(meyveAd, urunFiyat, urunMiktar);
        return urun;
    }

    public static Urun sebzeScannerOku(Scanner urunScanner) {


        System.out.println("Ürünün ismini giriniz.");
        String sebzeAd = urunScanner.nextLine();

        System.out.println("Ürünün fiyatını giriniz.");
        Float urunFiyat = urunScanner.nextFloat();

        System.out.println("Ürünün miktarını giriniz.");
        int urunMiktar = urunScanner.nextInt();


        Urun urun = new Sebze(sebzeAd, urunFiyat, urunMiktar);

        return urun;
    }

    public static Personel personelScannerOku(Scanner personelScanner) {

        System.out.println("Hangi personel ürün ekleyecek?");
        String personelAd = personelScanner.nextLine();


        Personel personel = new Personel(personelAd);

        return personel;
    }

    public static Musteri musteriScannerOku(Scanner musteriScanner) {

        System.out.println("Müşteri adı giriniz?");
        String musteriAd = musteriScanner.nextLine();

        Musteri musteri = new Musteri(musteriAd);

        return musteri;
    }


    public static void miktarTuruYazdirDongu(Urun urun) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Kilogram");
        System.out.println("2-Kasa");
        System.out.println("3-Adet");
        System.out.println("4-Çıkış");

        while (true) {

            System.out.println("Seçtiğiniz ürünün ağırlık tipini seçiniz.");


            int secim2 = scanner.nextInt();
            if (secim2 == 1) {

                urun.setUrunMiktarTuru(EnumMiktarTuru.KILOGRAM);


            } else if (secim2 == 2) {

                urun.setUrunMiktarTuru(EnumMiktarTuru.KASA);

            } else if (secim2 == 3) {

                urun.setUrunMiktarTuru(EnumMiktarTuru.ADET);


            } else if (secim2 == 4) {
                break;
            }
            break;
        }
    }


}
