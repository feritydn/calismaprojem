package day11stringmethods;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
		//ba�lay�p biti� de�erinde veya �ncesinde biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num1 %3 ==0) {
			
			for (int i = num1; i<= num2 ; i = i +3) {
				System.out.print(i +  " ");
				
			}
			
		}else if (num1 %3 == 1) {
			for (int i = num1+2; i<=num2; i= i+3) {
				System.out.print(i +  " ");
			}
			
		} else if (num1 %3 == 2) {
			
			for (int i = num1+1; i<= num2 ; i = i +3) {
				System.out.print(i +  " ");
				}
			
		}

		
		
		
		scan.close();
		
	}

}
