package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		// kullanicidan ad ve soyadini alip ekrana yazdiran bir program yaziniz.
		// (String kullaniniz)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi yaziniz.");
		
		String isim = scan.nextLine();
		System.out.println(isim);
		scan.close();
	}

}
