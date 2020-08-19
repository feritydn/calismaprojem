package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// Kullan�c�dan isim ve soyismini al�n. Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k
		// di�er harflerini k���k harf olarak ekrana yazd�ran program� yaz�n�z.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.next().toLowerCase();
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim = scan.next().toLowerCase();
		isimYazma (isim,soyisim);
		scan.close();
		
	}

	public static void isimYazma (String isim, String soyisim) {
		
		isim = isim.substring(0,1).toUpperCase() + isim.substring(1);
		soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1);
		
		System.out.println(isim + " " + soyisim);
	}
	
}

