package day06ifstatement;

import java.util.Scanner;

public class Odev10 {

	public static void main(String[] args) {
		// Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
		//�E�kenar ��gen� yazd�r�n. Sadece iki kenar uzunlu�u birbirine e�it ise ekrana �Ikizkenar ��gen�
		//yazd�r�n. T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen yazd�r�n�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen birinci kenari giriniz");
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen ikinci kenari giriniz");
		double num2 = scan.nextDouble();
		
		System.out.println("Lutfen ucuncu kenari giriniz");
		double num3 = scan.nextDouble();
		
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("eskenar ucgen");
			
		}else if ( num1 != num2 && num1 != num3 && num2 != num3) {
			
			System.out.println("Cesitkenar ucgen");
			
		}else {
			System.out.println("ikizkenar ucken");
		}
		scan.close();
	}

}
