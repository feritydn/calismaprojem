package day06ifstatement;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {

		//Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
		//“Hýristiyanlar icin kutsal gün” yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir gun ismi giriniz");
		
		String gun = scan.nextLine();
		
		if (gun.equals("Cuma")) {
			System.out.println("Muslumanlar icin kutsal gun.");
			
			
		}if (gun.equals("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
			
		}if (gun.equals("Pazar"))
			System.out.println("Hiristiyanlar icin kutsal gun");
		scan.close();
	}

}
