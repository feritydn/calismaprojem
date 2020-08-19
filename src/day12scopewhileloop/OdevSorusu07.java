package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu07 {

	public static void main(String[] args) {
//		Kullanýcýdan bir rakam alýn ve bu rakam icin çarpým tablosunu ekrana yazdýrýn.
//		Kullanýcýnýn hata yapmadýðýný farz edin.
//		Ornegin kullanýcý 3 girerse;
//		3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		int num2 = 1;
		
		while (num2 <=10) {
			System.out.println(num1 + "*"+ num2 +"  " + "=" + " " +  (num1 * num2) );
			
			num2++;
		}
		scan.close();
	}

}
