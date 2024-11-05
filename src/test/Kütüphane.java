package test;
import java.util.List;
import java.util.ArrayList;

public class Kütüphane {
	private String  isim;
	private List<Book> kitaplar;
	private List<Kullanicilar> aboneler;
	public Kütüphane(String isim) {
		this.kitaplar=new ArrayList<>();
		this.aboneler= new ArrayList<>();
		this.isim=isim;
	}
	public void kitapEkle(Book kitap) {
		kitaplar.add(kitap);
	}
	public void kitapSil(Book kitap) {
		kitaplar.remove(kitap);
	}
	public void kitapListele() {
		System.out.println("kütüphanedeki kitaplar:");
		for(Book kitap: kitaplar) {
			System.out.println(">> "+kitap);
		}
	}
	public void kullaniciEkle(Kullanicilar user) {
		aboneler.add(user);
	}
	public void kullaniciSil(Kullanicilar user) {
		aboneler.remove(user);
	}
	public void aboneListele() {
		System.out.println("KÜTÜPHANENİN EDGERLİ KULLANİCİLARİ");
		for(Kullanicilar user:aboneler) {
			System.out.println("- "+user);
		}
	}
	public Book kitapBul(int ISBN) {
		for(Book kitap: kitaplar) {
			if(kitap.setISBN()==ISBN) {
				return kitap;
			}
		}
		return null;
	}

}
