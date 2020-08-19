package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		
		// Kullanicidan bir character girmesini isteyiniz
		// Character harf ise kucuk harf olup olmadigini kontrol ediniz
		// Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
		// Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
		// Harf degilse ekrana "Harf degil" yazdiriniz
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir karakter giriniz");
		
		char harf = scan.next().charAt(0);
		
		String result = ((harf >=65 && harf <=90) || (harf >=97 && harf <=122))   
						? (harf >=65 && harf <=90 ? "BUYUK HARF" :"kucuk harf" )      : "Harf degil"     ;
						
		System.out.println(result);

		scan.close();
	}

}
