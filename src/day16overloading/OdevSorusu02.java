package day16overloading;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {

//		Kullan�c�dan isim ve soyismini al�n. Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k
//		di�er harflerini k���k harf olarak ekrana yazd�ran program� yaz�n�z.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen adinizi giriniz");
		String name = scan.next().toLowerCase();
		System.out.println("Lutfen soyadinizi giriniz");
		String surname = scan.next().toLowerCase();
		
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
		System.out.println(name + " " + surname);
		scan.close();
	}

}
