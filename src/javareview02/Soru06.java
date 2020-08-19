package javareview02;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý girmesini isteyiniz
		// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
		// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num = scan.nextInt();
		
		if (num %2 ==0) {
			System.out.println("Cift Sayi");
			
		}else {
			System.out.println("Tek sayi");
		}
scan.close();
	}

}
