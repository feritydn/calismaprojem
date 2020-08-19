package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		
		// Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen adininiz giriniz");
		
		String ad = scan.nextLine();
		
		System.out.println("Lutfen soyadiniz giriniz");
		
		String soyad = scan.nextLine();
		
		System.out.println(ad.substring(0,1).toUpperCase());
		
		System.out.println(soyad.substring(0,1).toUpperCase());
		
		scan.close();
	}

}
