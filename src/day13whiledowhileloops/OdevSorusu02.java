package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten 3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lutfen bitis degerini giriniz");
		int num2 = scan.nextInt();
		
		if (num2<num1) {
			num1 = num1+ num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		System.out.println("For loop ile cozumu");
		for(int i=num1; i<=num2; i++) {
			if (i%3==0 && i%5==0 ) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("While loop ile cozumu");
		
		int num =num1;
		
		while(num<=num2) {
			if (num%3==0 && num%5==0 ) {
				System.out.print(num + " ");
			}
			num++;
		}
		scan.close();
	}

}
