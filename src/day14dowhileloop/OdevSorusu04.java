package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Kullan�c�ya iki say� girmesini s�yleyin. Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n.
		// E�it de�ilse tekrar iki say� girmesini s�yleyin.
		
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
