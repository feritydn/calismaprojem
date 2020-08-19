package day09switchoperators;

import java.util.Scanner;

public class ArtikYilTernaryINterview {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir yýl girmesini isteyin, yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana “Artýk yýl degil”
		//yazdýrýn.

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir yil giriniz");
		
		int year = scan.nextInt();
		
		String result = (year %100 ==0 && year %400 ==00)?"Artik yil"      
					   :(year%100 !=0 && year %4 ==0 ? "Artik yil" : "Artik yil degil");
		
		System.out.println(result);

		scan.close();
	}

}
