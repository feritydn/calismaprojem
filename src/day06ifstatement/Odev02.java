package day06ifstatement;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

		//Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		//“b, c, d, e” den biri ise ekrana “Sessiz harf” yazdýrýn.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz");
		
		String str = scan.next();
		
		char harf = str.charAt(0);
		if (harf == 'a' ||harf == 'e' ||harf == 'i' ||harf == 'o' ||harf == 'u') {
			System.out.println("Sesli harf");
			
		}
		if(harf != 'a' &&  harf != 'e' &&harf != 'i' &&harf != 'o' &&harf != 'u') {
			System.out.println("Sessiz harf");
			
		}
		scan.close();
		
	}

}
