package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
		//Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin bastan ikinci harfi ile sondan ikinci harfini
		//b�y�k harf olarak ekrana yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen yasadiginiz ulkeyi yaziniz");
		
		String ulke = scan.nextLine();
		
		System.out.println(ulke.substring(1, 2).toUpperCase() + ulke.substring(ulke.length()-2).toUpperCase());
		
		scan.close();

	}

}
