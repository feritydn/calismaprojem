package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu04 {

	public static void main(String[] args) {
//		Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//		biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		
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
		int sum = 0;
		
		while (num1 <=num2) {
			sum = sum + num1;
			num1++;
		}
		System.out.println(sum);
		scan.close();
	}

}
