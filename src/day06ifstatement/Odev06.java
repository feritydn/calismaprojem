package day06ifstatement;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
		// �E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen birinci keanri girin");
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci keanri girin");
		double num2 = scan.nextDouble();
		
		System.out.println("Lutfen ucuncu keanri girin");
		double num3 = scan.nextDouble();
				
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("Eskenar ucgen");
			
		}else {
			System.out.println("Eskenar degil");
		}
		scan.close();
	}

}
