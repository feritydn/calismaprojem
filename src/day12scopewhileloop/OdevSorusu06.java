package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
//		Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
//		biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n. Kullan�c�n�n hata yapmad���n� farz edin.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic harfini giriniz");
		
		char harf1 = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen bitis harfini giriniz");
		
		char harf2 = scan.next().toUpperCase().charAt(0);
		
		while (harf1 <= harf2 ) {
			
			System.out.print(harf1 + " ");
			harf1++;
		}
		scan.close();
	}

}
