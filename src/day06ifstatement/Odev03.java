package day06ifstatement;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {

		//Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
		//�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. �Pazar� ise ekrana
		//�H�ristiyanlar icin kutsal g�n� yazd�r�n
		
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
