package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu09 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
		// ba�lay�p biti� de�erinde veya �ncesinde  biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);
		

		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num2<num1) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
			
			for (int b=num1 ; b<=num2; b++) {
				if (b%3==0) {
					System.out.print(b + " ");
				}
				
			}
			
			
			
		}else {
			for (int i=num1; i<=num2; i++) {
				if (i%3==0) {
					System.out.print(i + " ");
				}
				
			}
		}
scan.close();
	}

}
