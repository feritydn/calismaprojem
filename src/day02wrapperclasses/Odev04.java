package day02wrapperclasses;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi yaziniz");
		
		long saat = scan.nextLong();
				
		System.out.println(saat*60*60);	
		
		scan.close();
	}

}
