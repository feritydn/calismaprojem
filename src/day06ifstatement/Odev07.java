package day06ifstatement;

import java.util.Scanner;

public class Odev07 {

	public static void main(String[] args) {
		// Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. Eðer urun miktarý 1000 den fazla ise
		//Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. Diðer durumlarda
		// ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen urun miktarini giriniz");
		
		double urun = scan.nextDouble();
		
		System.out.println("Lutfen urun fiyatini giriniz");
		
		double fiyat = scan.nextDouble();
		
		if (urun >1000) {
			System.out.println((fiyat*90 /100)*fiyat);
		}else {
			System.out.println(fiyat * urun);
		}
		scan.close();
	}

}
