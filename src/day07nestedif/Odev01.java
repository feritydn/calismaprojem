package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		//Kullanýcýdan cinsiyetini girmesini isteyin.
		//Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
		//Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
		//Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn.
		//Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your gender");
		
		String gender = scan.next();
		gender.toLowerCase();
		
		System.out.println("Please enter your age");
		
		int age = scan.nextInt();
		
		if (gender.equals("male")) {if (age <=0 && age <18) {
			System.out.println("Boy");
			
		}else {
			System.out.println("man");
		}
			
		}else if(gender.equals("female")) { if (age <=0 && age <18) {
			System.out.println("girl");
			
		}else {
			System.out.println("woman");
		}
			
		}
		scan.close();
	}

}
