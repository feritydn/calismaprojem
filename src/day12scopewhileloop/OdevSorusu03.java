package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
//		Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
//		ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� while loop kullanarak
//		ekrana yazd�r�n�z.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		while (num1 <= num2) {
		if(num1 %2 ==0) {
			System.out.print(num1 + " ");
		}
		num1++;
		}
		scan.close();
	}

}
