package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullaniciadan 4 basamakli bir password aliniz
		// eger password cift sayi ise dogru tek sayi ise yanlis yaziniz.
		// eger sayi 4 basamakli degil ise tekrar deneyin yaziniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen password giriniz");
		
		int password = scan.nextInt();
		
		if (password > 999 && password <10000) {if (password %2 ==0) {
			System.out.println("Password corect");
			
		}else if(password %2 !=0) {
			System.out.println("Password wrong");
			
		}
			
		}else {
			System.out.println("Please Try again");
		}
		scan.close();
	}
	

}
