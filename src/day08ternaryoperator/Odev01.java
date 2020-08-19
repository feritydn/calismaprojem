package day08ternaryoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin, 
		//tamsayý çift ise ekrana “Çift” tek ise ekrana 
		//“Tek” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num = scan.nextInt();
		
		String result = (num % 2 == 0)   ?"Cift"    :"Tek"   ;
		
		System.out.println(result);
		
		scan.close();
	}

}
