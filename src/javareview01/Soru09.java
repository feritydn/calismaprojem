package javareview01;

import java.util.Scanner;

public class Soru09 {

	public static void main(String[] args) {
		/*Kullanýcýdan Dikdörtgenin kenar uzunluðunu alan ve sonra bu karenin alan ve
		çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		integer kullanýnýz
		Not: Alan: Boy x En
		Not: Çevre: 2x (Boy + En) */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin en ve boyunu giriniz");
		
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		
		int cevre = (numA+numB) * 2;
		int alan = numB * numA;
		System.out.println(alan);
		System.out.println(cevre);
	
		scan.close();

	}

}
