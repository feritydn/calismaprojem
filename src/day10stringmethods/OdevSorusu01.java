package day10stringmethods;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		//Kullan�c�dan kredi kart� numaras�n� al�n ve bu numaran�n ���nc�, d�rd�nc� ve sonuncu
		// rakamlar�n� ekrana yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen kart numaranizi giriniz");
		
		String kart = scan.next();
		
		System.out.println(kart.substring(2, 3));
		System.out.println(kart.substring(3, 4));
		System.out.println(kart.charAt(kart.length()-1));

		scan.close();
	}

}
