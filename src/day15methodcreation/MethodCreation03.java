package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		//// Basit hesap makinesi yapalim.
		
		// kullanicidan yapacagi islemi ve islem sembolu ile secmesini saglayalim.
		// kullanicidan iki sayi girmesini isteyelim 
		// girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiralim.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen ilk sayisi giriniz");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen yapacaginiz islemi giriniz");
		
		char islem = scan.next().charAt(0);
		
		System.out.println("Lutfen ikinic sayiyi giriniz");
		
		double num2 = scan.nextDouble();
		hesapMakinesi(num1, islem, num2);
		
		scan.close();

	}
	
	public static void hesapMakinesi (double num1, char islem, double num2) {
		
		switch (islem) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Yanlis islem girdiniz");
		}
		
	}

}
