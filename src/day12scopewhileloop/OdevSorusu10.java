package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu10 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan ba�lang�� ve biti�  harflerini al�n ve ba�lang�� harfinden 
		 * ba�lay�p biti� harfinde biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n.
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic harfini griniz");
		char ch1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen bitis harfini giriniz");
		char ch2 = scan.next().toUpperCase().charAt(0);
		
		if (ch2<ch1) {
			
			System.out.println("Harfleri alfabetik sirayla giriniz");
			
		}else if ((ch1>='Z' && ch1<='A') && (ch2>='A' && ch2<='Z') ) {
			
			for (char i=ch1; i<=ch2; i++) {
				System.out.print(i + " ");
				
			}
			
		}
		scan.close();
	}

}
