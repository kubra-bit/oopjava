package test;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
    	Kütüphane kütüphane = new Kütüphane("ÖMER HALİSDEMİR");
    	Book kitap1= new Book("ANNA KARENİNA","TOLSTOY",567);
    	Book kitap2= new Book("JANE EYRE","CHARLETTE BRONTE",812);
    	Book kitap3= new Book("NUTUK","MUSTAFA KEMAL ATATÜRK",346);
    	kütüphane.kitapEkle(kitap1);
    	kütüphane.kitapEkle(kitap2);
    	kütüphane.kitapEkle(kitap3);
    	Kullanicilar  person1= new Kullanicilar("yavuz",34);
    	Kullanicilar  person2= new Kullanicilar("selim",43);
    	Kullanicilar  person3= new Kullanicilar("selma",12);
    	kütüphane.kullaniciEkle(person1);
    	kütüphane.kullaniciEkle(person2);
    	kütüphane.kullaniciEkle(person3);
    	System.out.println(person1.toString());
    	System.out.println(person2.toString());
    	System.out.println(kütüphane.kitapBul(567));
    	
    	
    	
    	



    	
    	


        

    }
}
