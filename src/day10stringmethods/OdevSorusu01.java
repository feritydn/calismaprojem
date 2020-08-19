package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		//Kullanýcýdan kredi kartý numarasýný alýn ve bu numaranýn üçüncü, dördüncü ve sonuncu
		// rakamlarýný ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen kart numaranizi giriniz");
		
		String kart = scan.next();
		
		System.out.println(kart.substring(2, 3));
		System.out.println(kart.substring(3, 4));
		System.out.println(kart.charAt(kart.length()-1));

		scan.close();
	}

}
