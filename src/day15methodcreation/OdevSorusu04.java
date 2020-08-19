package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu04 {
	
	public static void main(String [] args) {
		
//		Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden birini ve iki say� se�mesini s�yleyin.
//		Hangi �ekli se�erse, o �eklin alan�n� ve �evresini ekrana yazd�ran program� yaz�n�z.
		
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
