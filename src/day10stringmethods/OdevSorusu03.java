package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ilk ve soy ismini al�n ilk ve soy isminin ilk harflerini b�y�k harf olarak ekrana yazd�r�n.
		
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
