package day09switchoperators;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {


		//Kullan�c�dan ay ismi al�n e�er ay ismi 31 �eken aylardan biri ise ekrana �Bu ay 31 g�nd�r� yazd�r�n.
		//E�er ay ismi 30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n.
		//E�er ay ismi 28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r� yazd�r�n.
		//Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir ay ismi giriniz");
		
		String ay = scan.next();
		
		ay = ay.toLowerCase();
		
		switch (ay) {
		
		case "ocak" :
			System.out.println("Bu ay 31 gun");
			break;
		case "mart" :
			System.out.println("Bu ay 31 gun");
			break;
		case "mayis" :
			System.out.println("Bu ay 31 gun");
			break;	
		case "temmuz" :
			System.out.println("Bu ay 31 gun");
			break;
		case "agustos" :
			System.out.println("Bu ay 31 gun");
			break;
		case "ekim" :
			System.out.println("Bu ay 31 gun");
			break;
		case "aralik" :
			System.out.println("Bu ay 31 gun");
			break;
		case "nisan" :
			System.out.println("Bu ay 30 gun");
			break;	
		case "haziran" :
			System.out.println("Bu ay 30 gun");
			break;
		case "eylul" :
			System.out.println("Bu ay 30 gun");
			break;
		case "kasim" :
			System.out.println("Bu ay 30 gun");
			break;
		case "subat" :
			System.out.println("Bu ay 28 yada 29 gun");
			break;	
		default:
			System.out.println("Gecersiz ay isimi girdiniz");	
		}
		scan.close();
	}

}
