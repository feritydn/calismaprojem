package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ilk ve soy ismini al�n ilk ve soy isminin ka� harften olu�tu�unu ekrana yazd�r�n.
		
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
