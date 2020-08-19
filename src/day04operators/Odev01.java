package day04operators;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		//Kullanýcýnýn girdiði 4 basamaklý sayýnýn tum rakamlarýnýn toplamýný
		//ekrana yazdýran bir program yazýnýz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dort basamakli bir tamsayi giriniz");
		
		int sayi = scan.nextInt();
		
		int a = sayi%10;
		int b = (sayi/10)%10;
		int c = (sayi/100)%10;
		int d = sayi / 1000;
		
		System.out.println(a + b + c + d);
		scan.close();		

	}

}
