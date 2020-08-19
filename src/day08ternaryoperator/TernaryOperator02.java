package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin
		// Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
		// Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Please enter the first number");
		double num1 = scan.nextDouble();
		
		System.out.println("Please enter the second number");
		double num2 = scan.nextDouble();
		
		
		double result = (num1 == num2)    ?num1 + num2     : num1*num2;
		
		System.out.println(result);
		
		scan.close();
	}

}
