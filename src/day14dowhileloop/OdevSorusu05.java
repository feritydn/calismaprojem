package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu05 {

	public static void main(String[] args) {
		// Kullan�c�ya bir String girmesini s�yleyin ve bu String�in ilk harfi ile son harfi ayn� ise
		// ekrana �Simetrik� yazd�r�n. Ayn� de�ilse tekrar bir String girmesini isteyin.

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir kelime veya cumle giriniz");
		
		String str = scan.nextLine();
		
		int lenght = str.length();
		
		String letter1 = str.substring(0,1).toUpperCase();
		
		String letter2 = (str.substring ((lenght-1),(lenght))).toUpperCase();
		
		do {
			if (letter1.equals(letter2)) {
				System.out.println("Simetrik");
				
			}else {
				System.out.println("Tekrar bir string giriniz");
			}
		}while ( (letter1.equals(letter2)));
		
		scan.close();
		
		
	}

}
