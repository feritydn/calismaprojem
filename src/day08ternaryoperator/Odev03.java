package day08ternaryoperator;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin, 
		// ekrana o tamsay�n�n mutlak degerini yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num = scan.nextInt();
		
		int result = (num >=0)     ? num    :num*(-1)   ;
		
		System.out.println(result);
		
		scan.close();

	}

}
