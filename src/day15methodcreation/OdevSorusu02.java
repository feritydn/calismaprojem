package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�, birinci say� b�y�k ise ekrana
		//�Birinci say� b�y�k�, ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen ilk sayiyi giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lutfen ikinci sayisi giriniz");
		int num2 = scan.nextInt();
		sayi(num1,num2);
		scan.close();

	}

	public static void sayi(int num1, int num2) {
		if (num1 == num2) {
			System.out.println("Esit");
		}else if (num1>num2) {
			System.out.println("Birinci sayi buyuk");
			
		}else {
			System.out.println("Ikinci sayi buyuk");
		}
	}
	
}
