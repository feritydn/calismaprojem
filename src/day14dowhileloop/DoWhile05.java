package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		////Kullanicidan ismin alin ilk harf buyuk harf ise 
		// "Dogru giris yaptiniz" ilk harf kucuk harf ise "Ilk harfi 
		// buyuk harf olarak giriniz"
		
		Scanner scan = new Scanner (System.in);
				
		String isim = "";
		
		do {
			System.out.println("Lutfen isminizi giriniz");
			
			isim = scan.nextLine();
			
			if (isim.charAt(0)>=65 && isim.charAt(0)<=90) {
				
				System.out.println("Dogru girdiniz");
				
			}else {
				System.out.println("Ilk harfi buyuk harf olarak giriniz");
			}
		}while (!(isim.charAt(0)>=65 && isim.charAt(0)<=90));
		scan.close();

	}

}
