package day09switchoperators;

import java.util.Scanner;

public class TernaryOdevSorusu {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
		//3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		//�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�

			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir tam sayi giriniz");
			int num = scan.nextInt();
				
			String result = (num>99 && num<1000)?"3 Basamakli":(num %2 ==0 ? "3 basamakl� olmayan �ift say�" : "3 basamakl� olmayan tek say� yazd�r�n.");
			System.out.println(result);	
			
			scan.close();
	}

}
