package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
		// Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		int num1 = scan.nextInt();
		
		System.out.println("For loop ile cozumu");
		for (int i=1; i<=num1; i++) {
			if (num1%i==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("While loop ile cozumu");
		
		int num2 =1;
		while (num2<=num1) {
			if (num1%num2==0) {
				System.out.print(num2 + " ");
			}
			num2++;
		}
		scan.close();
	}

}
