package day11stringmethods;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		// biten t�m tamsay�lar� ekrana yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		for (int i = num1 ; i <num2 ; i++) {
			
			System.out.print(i + " ");
			
		}
		scan.close();
	}

}
