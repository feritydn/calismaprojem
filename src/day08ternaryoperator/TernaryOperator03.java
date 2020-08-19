package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		
		// Kullanicidan iki sayi aliniz
		// Kucuk sayiyi ekrana yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen birinici sayiyi giriniz.");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();
		
		double result = (num1 > num2)    ? num2    : num1   ;
		
		System.out.println(result);
		
		scan.close();
		
		
	}

}
