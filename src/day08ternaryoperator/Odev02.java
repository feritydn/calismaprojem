package day08ternaryoperator;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// Kullan�c�dan iki tamsay� girmesini isteyin, 
		//ekrana her zaman b�y�k olan�n� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ilk tam sayi giriniz");
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen ikinci tam sayi giriniz");
		int num2 = scan.nextInt();
		
		int result = (num1 > num2)   ? num1    :num2   ;
		
		System.out.println(result);
		
		scan.close();

	}

}
