package day09switchoperators;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		//Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		//�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
		//Bu harflerin d���nda bir character i�in �Ge�ersiz character� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir character giriniz");
		
		char harf = scan.next().charAt(0);
				
		switch (harf) {
		
		case 'a' :
			System.out.println("Sesli harf");
			break;
		case 'e' :
			System.out.println("Sesli harf");
			break;
		case 'i' :
			System.out.println("Sesli harf");
			break;	
		case 'o' :
			System.out.println("Sesli harf");
			break;	
		case 'u' :
			System.out.println("Sesli harf");
			break;
		case 'b':
			System.out.println("Sessiz harf");
			break;
		case 'c':
			System.out.println("Sessiz harf");
			break;
		case 'd':
			System.out.println("Sessiz harf");
			break;
		case 'f':
			System.out.println("Sessiz harf");
			break;
		default:
			System.out.println("Gecersiz Character");
			
		}
		scan.close();
	}

}
