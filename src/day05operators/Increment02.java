package day05operators;

import java.util.Scanner;

public class Increment02 {

	public static void main(String[] args) {
		
		// kullanicidan int data type' de iki sayi alalim 
		// birinciyi 6, ikinciyi 9 arttirin.
		// 2. yolu kullanalim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki tamsayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		sayi1 += 6;
		sayi2 += 9;
		
		System.out.println(sayi1);   // 15 ==>21
		System.out.println(sayi2);   // 25 ==>34
		scan.close();
	}

}
