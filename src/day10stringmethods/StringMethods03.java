package day10stringmethods;

import java.util.Scanner;

public class StringMethods03 {

	public static void main(String[] args) {
		// CharAt() methodu belli index teki characteri return eder.
		
		String str1 = "cimbombom";
		
		// str1 in 4. indexindeki charecterindeki bulan kodu yaziniz.
		
		System.out.println(str1.charAt(4)); //o
		System.out.println(str1.charAt(0)); //c
		System.out.println(str1.charAt(6));//b
		
		// ONemli not: Eger indexi olmayan birsey girersek exception verir.
		
		// Length () methodu Stringin icinde kac karakter oldugunu verir.
		System.out.println(str1.length()); // 9
		// her zaman indexten buyuktur. Son harfin indexi lenght -1 dir.
		
		// kulaniciadan ismini girmesini isteyin sonra isminin son harfini 
		// ekrana yazdirin.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen adinizi giriniz");
		
		String name = scan.nextLine();
		
		int lenght = name.length();
		
		System.out.println(name.charAt(lenght-1));
		scan.close();
	}

}
