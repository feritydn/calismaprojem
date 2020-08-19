package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu05 {

	public static void main(String[] args) {
		
//		Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//		biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num2 < num1) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		int product = 1;
		
		while (num1 <=num2) {
			product = product * num1;
			num1++;
		}
		System.out.println(product);
		scan.close();
	}

}
