package day06ifstatement;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		//Kullan�c�dan iki say� al�n e�er say�lar�n i�aretleri ayn� ise ekrana �Ayn� i�aretli� yazd�r�n.
		//Say�lar�n i�aretleri farkl� ise ekrana �Farkl� i�aretli� yazd�r�n.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen birinci sayiyi giriniz.");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci sayiyi giriniz");
		
		double num2 = scan.nextDouble();
		
		if ((num1 >0 && num2 >0) || (num1<0 && num2<0)) {
			System.out.println("Ayni isaretli");
			
		}
		if ((num1<0 && num2>0) || (num1>0 && num2<0)) {
			System.out.println("Farkli isaretli");
		}
		scan.close();
	}

}
