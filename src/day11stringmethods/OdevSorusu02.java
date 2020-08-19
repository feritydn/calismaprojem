package day11stringmethods;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
		// baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý ekrana yazdýrýn.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num1 %2 ==0) {
			
			for (int i = num1; i <=num2; i = i + 2) {
				System.out.print(i + " ");
				
			}
		}else if (num1 %2 !=0) {
			for (int i = num1 + 1 ; i<= num2; i = i+2) {
				System.out.print(i + " ");
				
			}
		}
		scan.close();
	}

}
