package day06ifstatement;

import java.util.Scanner;

public class Odev12 {

	public static void main(String[] args) {
		// Kullanýcýdan bir yýl alýn eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.
		//Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn.
		//Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn.
		
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
