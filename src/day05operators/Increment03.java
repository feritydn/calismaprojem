package day05operators;

import java.util.Scanner;

public class Increment03 {

	public static void main(String[] args) {
		

		// kullanicidan int data type de iki tane sayi alalim.
		// bu variable leri en kisa yolu kullanarak 1 artirin.
		
		// En kisa yol sadece 1 artirmak icin kullanilir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tamsayi giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		num1++;
		num2++;
		
		System.out.println(num1);  //15 ==>16
		System.out.println(num2);  //25 ==>26
		scan.close();
	}

}
