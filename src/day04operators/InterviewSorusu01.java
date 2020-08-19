package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
		// iki tane variablenin degerlerini yer degistiriniz
		// sayi1 = 12, sayi2 = 30 kod yazaca[iz ve 
		// sayi1= 30, sayi2 = 12 olacak (SWAP)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("yerlerini degistirmek icin iki sayi giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		// 1. Yol;
		
		System.out.println("Yer degistirmeden once");
		System.out.println(sayi1);    //12.0
		System.out.println(sayi2);    //30.0
		
		double gecici = 0.0 ;
		
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println("Yer degistirdikten sonra");
		System.out.println(sayi1);   //30.0
		System.out.println(sayi2);   //12.0
		System.out.println(gecici);  //12.0
		
		//2. yol bos kap kullanma
		
		System.out.println("Lutfen iki sayi daha yaziniz");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		a= a + b;
		b= a- b;
		a= a- b;
		
		System.out.println(a);   //15.0
		System.out.println(b);   //20.0
		scan.close();		

	}

}
