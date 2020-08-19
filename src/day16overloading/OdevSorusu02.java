package day16overloading;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {

//		Kullanýcýdan isim ve soyismini alýn. Kullanýcýnýn isim ve soyisminin ilk harflerini büyük
//		diðer harflerini küçük harf olarak ekrana yazdýran programý yazýnýz.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen adinizi giriniz");
		String name = scan.next().toLowerCase();
		System.out.println("Lutfen soyadinizi giriniz");
		String surname = scan.next().toLowerCase();
		
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
		System.out.println(name + " " + surname);
		scan.close();
	}

}
