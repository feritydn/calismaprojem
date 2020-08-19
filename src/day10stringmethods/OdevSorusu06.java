package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
		//Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
		//büyük harf olarak ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen yasadiginiz ulkeyi yaziniz");
		
		String ulke = scan.nextLine();
		
		System.out.println(ulke.substring(1, 2).toUpperCase() + ulke.substring(ulke.length()-2).toUpperCase());
		
		scan.close();

	}

}
