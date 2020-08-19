package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		
		/*
	     Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra diktörtgenin alan ve 
	     cevresini hesaplayýp ekrana yazdýran bir program yazýnýz. 
	     Not: Alan: Boy x En
	     Not: Çevre: 2x (Boy + En)
       */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin enini ve boyunu yaziniz.");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		System.out.println(boy*en);
		System.out.println(2*(boy+en));
		scan.close();
	}

}
