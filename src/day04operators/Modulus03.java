package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		// kullanicdan 3 basamakli bir tam sayi alin 
		//bu sayinin rakanlari toplamini bulunuz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 3 basamakli bir tamsayi yaziniz");
		
		int sayi = scan.nextInt();
		int sonRakam = sayi%10;
		int ortaRakam = (sayi/10)%10;
		int ilkRakam = sayi/100;
		
		System.out.println(sonRakam + ortaRakam + ilkRakam);
		scan.close();
	}

}
