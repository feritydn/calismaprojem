package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”, birinci sayý büyük ise ekrana
		//“Birinci sayý büyük”, ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen ilk sayiyi giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lutfen ikinci sayisi giriniz");
		int num2 = scan.nextInt();
		sayi(num1,num2);
		scan.close();

	}

	public static void sayi(int num1, int num2) {
		if (num1 == num2) {
			System.out.println("Esit");
		}else if (num1>num2) {
			System.out.println("Birinci sayi buyuk");
			
		}else {
			System.out.println("Ikinci sayi buyuk");
		}
	}
	
}
