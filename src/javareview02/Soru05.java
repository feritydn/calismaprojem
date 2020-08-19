package javareview02;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// Scanner kullanarak kullanýcýdan saat, dakika ve saniye bilgilerini alarak 
		// sonucu yazdýrýnz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scan = new Scanner(System.in);
		
		//String amOrPm = " ";
		
		System.out.println("Lutfen saati giriniz");
		int saat = scan.nextInt();
		
		System.out.println("Lutfen dakika giriniz");
		int dak = scan.nextInt();
		
		System.out.println("Lutfen saniye giriniz");
		int san = scan.nextInt();
		
		System.out.println("Lutfen AM veya PM giriniz");
		String time = scan.next();
		
		String result = (saat + ":"+ dak + ":" + san +":" +  time);
		System.out.println(result);
		scan.close();

	}

}
