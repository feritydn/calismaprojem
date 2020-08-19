package day02wrapperclasses;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		//Mil’i kilometreye çeviren bir program yazýnýz. (double kullanýnýz)
		//Not 1: km = mile x 1.6
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir sayi giriniz.");
		
		double sayi1 = scan.nextDouble();
		
		System.out.println(1.6*sayi1);
		scan.close();
	}

}
