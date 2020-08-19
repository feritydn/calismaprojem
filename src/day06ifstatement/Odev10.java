package day06ifstatement;

import java.util.Scanner;

public class Odev10 {

	public static void main(String[] args) {
		// Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		//“Eþkenar üçgen” yazdýrýn. Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen”
		//yazdýrýn. Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn”
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen birinci kenari giriniz");
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci kenari giriniz");
		double num2 = scan.nextDouble();
		
		System.out.println("Lutfen ucuncu kenari giriniz");
		double num3 = scan.nextDouble();
		
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("eskenar ucgen");
			
		}else if ( num1 != num2 && num1 != num3 && num2 != num3) {
			
			System.out.println("Cesitkenar ucgen");
			
		}else {
			System.out.println("ikizkenar ucken");
		}
		scan.close();
	}

}
