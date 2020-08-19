package day06ifstatement;

import java.util.Scanner;

public class Odev08 {

	public static void main(String[] args) {
		// Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf” yazdýrýn.
		//Diðer durumlarda ekrana “Harf deðil” yazdýrýn.
		
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
