package javareview02;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		// Kullan�c�dan bir say� girmesini isteyiniz
		// Say� tek say� ise "Say�n�z tek say�d�r."
		// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z
		
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
