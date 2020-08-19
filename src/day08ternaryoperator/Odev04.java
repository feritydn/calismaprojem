package day08ternaryoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		//En ve boy eþit ise ekrana “Kare”
		//farklý ise ekrana “Dikdörtgen” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen en giriniz");
		int en = scan.nextInt();
		
		System.out.println("Lutfen ikinci boy giriniz");
		int boy = scan.nextInt();
		
		String result = (en == boy)    ?"kare"    : "dikdortgen"   ;
		
		System.out.println(result);
		
		scan.close();
	}

}
