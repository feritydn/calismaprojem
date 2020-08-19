package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
//		Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
//		baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý while loop kullanarak
//		ekrana yazdýrýnýz.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		while (num1 <= num2) {
		if(num1 %2 ==0) {
			System.out.print(num1 + " ");
		}
		num1++;
		}
		scan.close();
	}

}
