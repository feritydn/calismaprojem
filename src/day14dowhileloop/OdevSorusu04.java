package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Kullanýcýya iki sayý girmesini söyleyin. Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn.
		// Eþit deðilse tekrar iki sayý girmesini söyleyin.
		
		Scanner scan = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		do {
			System.out.println("Lutfen ilk sayisi giriniz");
			num1 = scan.nextInt();
			System.out.println("Lutfen ilk sayisi giriniz");
			num2 = scan.nextInt();
			
			if (num1 == num2) {
				System.out.println("Kare olusturdunuz");
				
			}else {
				System.out.println("tekrar iki sayi giriniz");
			}
		}while (num1!=num2);
		
		scan.close();
		
		

	}

}
