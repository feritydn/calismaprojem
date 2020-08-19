package day09switchoperators;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {


		//Kullanýcýdan ay ismi alýn eðer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn.
		//Eðer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn.
		//Eðer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn.
		//Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.
		
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
