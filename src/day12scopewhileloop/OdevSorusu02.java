package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten t�m tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num1 < num2) {
			while (num1 <num2) {
				System.out.print(num1 + " ");
				num1++;
			}
			
		}else {
			System.out.println("Lutfen baslangic degerinin bitis degerinden kucuk giriniz");
		}
		
		
	scan.close();	
		
	}

}
