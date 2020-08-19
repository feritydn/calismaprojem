package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		// Kullan�c�ya say� girmesini s�yleyin. Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana
		// yazd�ran bir program yaz�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir sayi giriniz");
		int num = scan.nextInt();

		rakamToplami (num);
		
		scan.close();
	}

	public static void rakamToplami (int num) {
		int sum = 0;
		while (num!=0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("Rakamlarin Toplami: " + sum);
	}
}
