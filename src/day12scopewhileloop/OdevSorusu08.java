package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu08 {

	public static void main(String[] args) {
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin 
		// bastan ikinci harfi ile sondan ikinci harfini
		// b�y�k harf olarak ekrana yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ulkenizin adini giriniz");
		
		String ulke = scan.nextLine();
		
		System.out.print(ulke.toUpperCase().charAt(1) + " " );
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
		scan.close();

	}

}
