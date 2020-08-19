package day06ifstatement;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		// “Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen birinci keanri girin");
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci keanri girin");
		double num2 = scan.nextDouble();
		
		System.out.println("Lutfen ucuncu keanri girin");
		double num3 = scan.nextDouble();
				
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("Eskenar ucgen");
			
		}else {
			System.out.println("Eskenar degil");
		}
		scan.close();
	}

}
