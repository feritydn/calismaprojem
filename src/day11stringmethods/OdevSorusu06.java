package day11stringmethods;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde
		// biten tüm harfleri büyük harf olarak ekrana yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen baslangic harfini giriniz");
		
		char harf1 = scan.next().charAt(0);
		
		System.out.println("Lutfen bitis harfini giriniz");
		
		char harf2 = scan.next().charAt(0);
		
		
			
			for (char i = harf1 ; i <= harf2 ; i++) {
								
				String.valueOf(i).toUpperCase();
				
				System.out.print(String.valueOf(i).toUpperCase() + " ");
			}
			
		scan.close();
		
		

	}

}
