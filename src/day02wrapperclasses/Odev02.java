package day02wrapperclasses;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		/*Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir
		*Program yaz�n�z. (byte kullan�n�z)
		*Not 1: ��genin Cevresi: a + b + c	
        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ucgenin olculerini giriniz.");
		
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		
		System.out.println(a+b+c);
		scan.close();
	}

}
