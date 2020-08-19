package day06ifstatement;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		//Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın.
		//Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen birinci sayiyi giriniz.");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci sayiyi giriniz");
		
		double num2 = scan.nextDouble();
		
		if ((num1 >0 && num2 >0) || (num1<0 && num2<0)) {
			System.out.println("Ayni isaretli");
			
		}
		if ((num1<0 && num2>0) || (num1>0 && num2<0)) {
			System.out.println("Farkli isaretli");
		}
		scan.close();
	}

}
