package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu07 {

	public static void main(String[] args) {
//		Kullan�c�dan bir rakam al�n ve bu rakam icin �arp�m tablosunu ekrana yazd�r�n.
//		Kullan�c�n�n hata yapmad���n� farz edin.
//		Ornegin kullan�c� 3 girerse;
//		3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		int num2 = 1;
		
		while (num2 <=10) {
			System.out.println(num1 + "*"+ num2 +"  " + "=" + " " +  (num1 * num2) );
			
			num2++;
		}
		scan.close();
	}

}
