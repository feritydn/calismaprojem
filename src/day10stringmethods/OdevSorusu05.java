package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu05 {

	public static void main(String[] args) {
		//Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen yasadiginiz ulkeyi yaziniz");
		
		String ulke = scan.nextLine();
		
		System.out.println(ulke.substring(0, 2).toUpperCase());
		
		scan.close();

	}

}
