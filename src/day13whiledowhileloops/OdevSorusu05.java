package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu05 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn ve bu String’in ilk harfi ile son harfinin yerlerini deðiþtirerek ekrana yazdýrýn.
		//Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle ya da kelime giriniz");
		
		String str = scan.nextLine();
		
		// ilk harfi al
		// son harfi al
		// ilk harf ile son harf arasindaki degerleri al
		// son harf + ara + ilk diye yazdir
		
		System.out.println(str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0) );
		scan.close();
	}

}
