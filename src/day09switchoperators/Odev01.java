package day09switchoperators;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn. “Pazar” ise ekrana
		//“Hýristiyanlar için kutsal gün” yazdýrýn. Diler günler icin “Kutsal gün deðil” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen gun ismi giriniz");
		
		String gun = scan.next();
		gun.toUpperCase();
		
		switch (gun) {
		
		case "Cuma":
			System.out.println("Muslumanlar icin kutsal gun");
			break;
		case "Cumartesi":
			System.out.println("Yahudiler icin kutsal gun");
			break;
		case "Pazar":
			System.out.println("Hiristiyanlar icin kutsal gun");
			break;
		default :
			System.out.println("Kutsal gun degil");
		}
		scan.close();
	}

}
