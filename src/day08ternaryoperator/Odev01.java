package day08ternaryoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin, 
		//tamsay� �ift ise ekrana ��ift� tek ise ekrana 
		//�Tek� yazd�r�n.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num = scan.nextInt();
		
		String result = (num % 2 == 0)   ?"Cift"    :"Tek"   ;
		
		System.out.println(result);
		
		scan.close();
	}

}
