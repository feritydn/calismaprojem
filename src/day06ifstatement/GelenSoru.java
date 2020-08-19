package day06ifstatement;

import java.util.Scanner;

public class GelenSoru {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("	Wellcome To The Score Calculator Program");
		
		
		System.out.println("             Please Enter Your First Score");
		double sc1 = scan.nextDouble();
				
		System.out.println("             Please Enter Your Second Score");
		double sc2 = scan.nextDouble();
				
		System.out.println("             Please Enter Your Third Score");
		double sc3 = scan.nextDouble();
				
		System.out.println("Your 1th Score is " + sc1);
		System.out.println("Your 2th Score is " + sc2);
		System.out.println("Your 3th Score is " + sc3);
		
				
		double sum = sc1 + sc2 + sc3 ;
		double average = sum/3;
		System.out.println("Average Of Your Scores = " + average );
		
		if (average<0) {
			System.out.println("Wrong Score : Your Score Can Not be Negative");
		}
		else if (average >= 0 && average <= 49) {
			System.out.println("Your Note = FF");
		}
		else if (average >= 50 && average <= 54) {
			System.out.println("Your Note = DD");
		}
		else if (average >= 55 && average <= 59) {
			System.out.println("Your Note = DC");
		}
		else if (average >= 60 && average <= 79) {
			System.out.println("Your Note = CC");
		}
		else if (average >= 80 && average <= 84) {
			System.out.println("Your Note = CB");
		}
		else if (average >= 85 && average <= 89) {
			System.out.println("Your Note = BB");
		}
		else if (average >= 90 && average <= 94) {
			System.out.println("Your Note = BA");
		}
		else if (average >= 95 && average <= 100) {
			System.out.println("Your Note = AA");
		}
		else {
			System.out.println("Wrong Score : ");
			System.out.println("Your Score Average Can Not Be More Than A Hundred");
		}
		scan.close();		
				
	}

}
