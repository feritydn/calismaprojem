package day06ifstatement;

import java.util.Scanner;

public class Odev08 {

	public static void main(String[] args) {
		// Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
		//Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir charecter giriniz");
		
		char ch = scan.next().charAt(0);
		
		if ((ch >=65 && ch <=90) || (ch >=97 && ch <=122) ) {
			System.out.println("Harf");
			
		}else {
			System.out.println("Harf degil");
		}
		scan.close();
	}

}
