package ders_kayit_uygulamasi;
//Scanner Sınıfını import Ettik
import java.util.Scanner;

public class Ders_kayit_uygulamasi {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Kullanıcıya Kısa Bir Bilgi Verildi
        System.out.println("***** Ders Kayıt Uygulaması *****\n");

        //Kullanıcıdan Almak İstediği Ders Sayısını Aldık
        System.out.println("Güz Döneminde Almak İstediğiniz Ders Sayısını Giriniz :");
        int ders_sayi = input.nextInt();

        //Dersler Diye Bir Dizi Oluşturduk
        String[] dersler = new String[ders_sayi];

        //Dersler Dizisinin indeksi kadar Ders Girişi Döngüsü Oluşturduk Ve Dizinin İçine Teker Teker import Ettik
        for (int i = 0; i <= dersler.length - 1; i++) {

            System.out.printf((i + 1) + ".Ders : ");

            //Ekleme Kısmı
            dersler[i] = input.next();

            System.out.println("Ders Kaydı Başarılı..");

        }

        //Alınan Dersleri Yazdırdık
        System.out.println("\nAlınan Dersler : \n");

        for (int i = 0; i <= dersler.length - 1; i++) {

            System.out.println(dersler[i] + " ");
        }

    }

}
