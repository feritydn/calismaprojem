package day02wrapperclasses;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen prizmanin olculerini giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		int yuk = scan.nextInt();
		
		System.out.println(en*boy*yuk);
scan.close();
	}

}
