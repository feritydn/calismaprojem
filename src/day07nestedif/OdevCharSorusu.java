package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n. 
	    // Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a Character");
		
		char ch = scan.next().charAt(0);
		
		if ((ch <=122 && ch >=97) || (ch <=90 && ch >= 65)) {
			System.out.println("Its a letter");
			
		}else {
			System.out.println("It isn't letter");
		}
		scan.close();
	}

}
