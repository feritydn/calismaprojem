package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		// kullanicidan yil girmesini isteyin
		// girilen yil artik yil ise ekrana artik yil yazdirin
		// artik yil degil ise artik yil degil yazdirin.
		
		// Artik yil 1) yil 100 e bolunurse 400 e bolunmeli ==> 1300 artik degil
		//                                                    ==> 1200 artik yil
		//           2) yil 100 e bolunmezse 4 e bolunmeli  

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the year");
		
		int year = scan.nextInt();
		
		if (year %100 ==0 && year %400 == 0) {
			System.out.println("leap year");
		
		}else if (year %100 !=0 && year %4 ==0) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
		scan.close();
	}

}
