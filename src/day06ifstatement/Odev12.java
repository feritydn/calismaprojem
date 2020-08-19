package day06ifstatement;

import java.util.Scanner;

public class Odev12 {

	public static void main(String[] args) {
		// Kullan�c�dan bir y�l al�n e�er y�l 1000�e bulunuyorsa ekrana �Milenyum� yazd�r�n.
		//E�er y�l 100�e bulunuyorsa ekrana �Y�zy�l� yazd�r�n.
		//E�er y�l 10�a bulunuyorsa ekrana �Ony�l� yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir yil giriniz");
		
		int year = scan.nextInt();
		
		if (year %1000 == 0) {
			System.out.println("Milenyum");
			
		}else if (year %100 ==0) {
			System.out.println("Yuzyil");
			
		}else if (year %10 ==0 ) {
			System.out.println("On yil");
			
		}else {
			System.out.println("Sadece yil");
		}
		scan.close();
	}

}
