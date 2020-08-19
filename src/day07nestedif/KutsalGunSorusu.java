package day07nestedif;

import java.util.Scanner;

public class KutsalGunSorusu {

	public static void main(String[] args) {

		
		//Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
		//“Hýristiyanlar icin kutsal gün” yazdýrýn
		// Diger gunler icin kutsal gun degil yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir gun giriniz");
		
		String gun = scan.next();
		
		if (gun.equalsIgnoreCase("cuma")) {
			
			System.out.println("Muslumanlar icin kutsal gun");
			
		}else if (gun.equalsIgnoreCase("cumartesi")) {
			
			System.out.println("Yahudiler icin kutsal gun");

		} else if(gun.equalsIgnoreCase("Pazar")) {
			
			System.out.println("Hiristiyanlar icin kutsal gun");
			
		}else {
			System.out.println("Kutsal gun degil");
		}
		scan.close();
			
	}

}
