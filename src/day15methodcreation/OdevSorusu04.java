package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu04 {
	
	public static void main(String [] args) {
		
//		Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayý seçmesini söyleyin.
//		Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen paralelkenar, ucgen yada dikdortgenden birini seciniz");
		
		String sekil = scan.next().toLowerCase();
		
		System.out.println("Lutfen birinci kenari giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen ikkinci kenari giriniz");
		
		int num2 = scan.nextInt();		
		
		sekil(sekil, num1, num2);
		
		scan.close();
		
		
	}
	
	public static void sekil(String sekil, int num1, int num2) {
		
		switch (sekil) {
		case "paralelkenar":
			System.out.println("Paralelkenar alan= " + (num1*num2));
			System.out.println("Paralelkenar cevre= " + (2*(num1+num2)));
			break;
			
		case "dikdortgen":
			System.out.println("dikdortgen alan= " + (num1*num2));
			System.out.println("dikdortgen cevre= " + (2*(num1+num2)));
			break;
			
		case "ucgen":
			System.out.println("ucgen alan= " + (num1*num2)/2);
			break;
		default:
			System.out.println("Yanlis sekil ismi girdiniz");
		
		}
		
	}

}
