package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu05 {

	public static void main(String[] args) {
		// Kullan�c�ya bir String girmesini s�yleyin ve bu String�i yukar�dan a�a��ya do�ru yazd�ran
		//Program yaz�n�z. Ornegin; CAN ==> C
		//									A
		//									N
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("please write your name");
		
		String name = scan.nextLine();
		int num1=0;
		name(name,num1);
		scan.close();

	}
	
	public static void name (String name, int num1) {
		
		for (num1 = 0; num1<name.length(); num1++) {
			System.out.println(name.charAt(num1));
			
		}
		
	}

}
