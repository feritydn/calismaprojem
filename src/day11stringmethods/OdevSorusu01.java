package day11stringmethods;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		//Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarý ekrana yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		for (int i = num1 ; i <num2 ; i++) {
			
			System.out.print(i + " ");
			
		}
		scan.close();
	}

}
