package day06ifstatement;

import java.util.Scanner;

public class Odev07 {

	public static void main(String[] args) {
		// Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun miktar� 1000 den fazla ise
		//Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. Di�er durumlarda
		// �demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
		
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
