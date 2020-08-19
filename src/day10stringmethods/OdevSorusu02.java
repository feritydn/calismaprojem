package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		
		//Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen adininiz giriniz");
		
		String ad = scan.nextLine();
		
		System.out.println("Lutfen soyadiniz giriniz");
		
		String soyad = scan.nextLine();
		
		System.out.println("ad uzunlugu: " + ad.length());
		
		System.out.println("soyad uzunlugu: " + soyad.length());

		scan.close();
	}

}
