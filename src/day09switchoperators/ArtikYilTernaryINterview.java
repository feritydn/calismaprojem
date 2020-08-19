package day09switchoperators;

import java.util.Scanner;

public class ArtikYilTernaryINterview {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir y�l girmesini isteyin, y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil�
		//yazd�r�n.

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir yil giriniz");
		
		int year = scan.nextInt();
		
		String result = (year %100 ==0 && year %400 ==00)?"Artik yil"      
					   :(year%100 !=0 && year %4 ==0 ? "Artik yil" : "Artik yil degil");
		
		System.out.println(result);

		scan.close();
	}

}
