package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu09 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
		// baþlayýp bitiþ deðerinde veya öncesinde  biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		

		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num2<num1) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
			
			for (int b=num1 ; b<=num2; b++) {
				if (b%3==0) {
					System.out.print(b + " ");
				}
				
			}
			
			
			
		}else {
			for (int i=num1; i<=num2; i++) {
				if (i%3==0) {
					System.out.print(i + " ");
				}
				
			}
		}
scan.close();
	}

}
