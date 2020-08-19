package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Kullanýcýdan uzunluðu çift sayý olan bir String alýn ve bu String’in ilk yarýsýný ekrana yazdýrýn.
		// Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen uzunlugu cift olan bir string giriniz");
		
		String str = scan.nextLine();
		
		System.out.println(str.substring(0, str.length()/2));
		scan.close();
	}

}
