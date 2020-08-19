package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdýrýn.
		// “a” harfi yoksa tekrar bir String girmesini isteyin.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir kelime veya cumle giriniz");
		
		String str = scan.nextLine();
		
		do {
			if (str.contains("a")) {
				System.out.println("a harfi var");
				
			}
			
			System.out.println("tekrar bir String giriniz");
		}while (!(str.contains("a")));

		scan.close();
	}

}
