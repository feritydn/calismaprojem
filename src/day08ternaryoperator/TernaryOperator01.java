package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// kullanicidan bir sayi aliniz
		// sayi pozitif veya 0 ise ekrana pozitif veya 0 yaziniz
		// negatif ise ekrana negatif yaziniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		
		int num = scan.nextInt();
		
		if (num >=0) {
			System.out.println("Pozitif or 0");
		}else {
			System.out.println("Negatif");
		}
		
		String result = (num >=0)    ?   "Pozitif or 0"     :"Negatif";
		
		System.out.println(result);
		
		scan.close();

	}

}
