package day05operators;

import java.util.Scanner;

public class Increment01 {

	public static void main(String[] args) {

       // kullanicidan iki sayi alalim 
		// ve ilk sayisi 5 ikinci sayiyi 8 artiralim.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		sayi1 = sayi1 + 5;
		sayi2 = sayi2 + 8;
		
		System.out.println(sayi1);  //15 ==>20
		System.out.println(sayi2);  // 25 ==>33
		scan.close();
	}

}
