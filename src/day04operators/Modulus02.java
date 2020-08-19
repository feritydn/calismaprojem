package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		// kullanicinin girdigi dort basamakli  sayisinin ilk ve son 
		//rakaminin toplamini veren program yaziniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
		int sayi = scan.nextInt();
		int sonRakam = sayi%10;
		int ilkRakam = sayi/1000;
		
		System.out.println(sonRakam + ilkRakam);
		scan.close();
	}

}
