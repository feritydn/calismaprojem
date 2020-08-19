package day05operators;

import java.util.Scanner;

public class Increment04 {

	public static void main(String[] args) {

		
		// int data type de bir tane variable olusturun
		// Bu variable i her seferinde 1 artirmak icin 3 yontemi kullanin.
		// sayiyi kullanicadan alalim.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int num1 = scan.nextInt();
		
		num1 = num1 + 1;
		System.out.println(num1);   //15 ==>16
		
		num1 += 1;
		System.out.println(num1);   // 17
		
		num1++;
		System.out.println(num1);  // 18
		
		scan.close();
		
		
		
		
	}

}
