package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		//Kullan�c�dan cinsiyetini girmesini isteyin.
		//Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n.
		//Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n.
		//Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n.
		//Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.
		
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
