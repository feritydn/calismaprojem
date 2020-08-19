package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		//biten tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num1 < num2) {
			while (num1 <num2) {
				System.out.print(num1 + " ");
				num1++;
			}
			
		}else {
			System.out.println("Lutfen baslangic degerinin bitis degerinden kucuk giriniz");
		}
		
		
	scan.close();	
		
	}

}
