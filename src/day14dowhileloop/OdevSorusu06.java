package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
		// Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa ekrana �a harfi var� yazd�r�n.
		// �a� harfi yoksa tekrar bir String girmesini isteyin.
		
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
