package day06ifstatement;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

		//Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		//�b, c, d, e� den biri ise ekrana �Sessiz harf� yazd�r�n.
		
		
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
