package day06ifstatement;

import java.util.Scanner;

public class Odev11 {

	public static void main(String[] args) {
		// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana 
		//A, B, C veya D yazd�r�n.
		// 1. 50 den az - D 2. 50(dahil) ile 60 aras� - 
		//C 3. 60(dahil) ile 80 aras� - B. 4. 80(dahil) ustu- A
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen notunuzu giriniz");
		
		int not = scan.nextInt();
		if (not >=0 && not <50) {
			System.out.println("D");
			
		}else if (not >=50 && not <60) {
			System.out.println("C");
			
		}else if (not >=60 && not <80) {
			System.out.println("B");
			
		}else if(not >=80 && not <=100) {
			
			System.out.println("A");
			
		}else {
			System.out.println("yanlis deger girdiniz");
		}
		scan.close();

	}

}
