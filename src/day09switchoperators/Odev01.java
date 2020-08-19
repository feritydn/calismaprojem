package day09switchoperators;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar i�in kutsal g�n� yazd�r�n.
		//�Cumartesi� ise ekrana �Yahudiler i�in kutsal g�n� yazd�r�n. �Pazar� ise ekrana
		//�H�ristiyanlar i�in kutsal g�n� yazd�r�n. Diler g�nler icin �Kutsal g�n de�il� yazd�r�n.
		
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
