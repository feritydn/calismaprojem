package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		// kullanici iki tam sayi versin 
		// program bu tam sayilarinin toplamini ve carpimini
		//ekrana yazdirsin
		
		Scanner scan = new Scanner (System.in); // Scanner kelimesinin alti kirmizi olacak bu javada boyle bir class yok ithal et demek
		                                        // biz de kelimenin ustunde bir saniye bekleyip import ediyoruz.
		
		System.out.println("Lutfen iki tam sayi yaziniz.");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1*sayi2);
		scan.close();
	}

}
