package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten 4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1=0;
		
		int num2 = 0;
		
		System.out.println("Lutfen baslangic degerini girniz");
		num1= scan.nextInt();
		System.out.println("Lutfen bitis degerini giriniz");
		num2 = scan.nextInt();
		
					
		do {
						
			if (num1 %4 ==0 && num1 %6 == 0) {
				
				System.out.print(num1 + " ");
				
			}
			num1++;
		}while(num1<=num2);
		
		scan.close();
		
		

	}

}
