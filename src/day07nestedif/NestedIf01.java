package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {
	
	public static void main(String[] args) {
		
		// Kullanicidan bir sayi alin 
		//bu sayi pozitif ise 9 dan buyuk mu diye kontrol edin
		// 9 dan buyukse ekrana sayi yazdirin.
		// 9 dan kucuk esit ve sifirdan buyuk esit ise ekrana rakam yadirtin
		// negatif ise ekrana sayi yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int num = scan.nextInt();
		
		if (num >=0) { if(num >=0 && num <=9) {
			System.out.println("Rakam");
			
		}else {
			System.out.println(" PozitifSayi");
		}
			
		}else {
			System.out.println("negatif sayi");
		}
		scan.close();
	}

}
