package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
//		Kullanýcýya kaç elemanlý bir array gireceðini sorun.
//		Kullanýcýdan array’in elemanlarýný girmesini isteyin.
//		a) Bu array’in tum elemanlarýný ekrana yazdýrýn.
//		b) Bu arayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.
//		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen kac elemanli bir array olusturacaginiz yaziniz");
		
		int lenght = scan.nextInt();
		
		System.out.println("Lutfen array elemanlarini giriniz");
		
		int arr1 [] = new int[lenght];
		
		for (int i=0; i<lenght; i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
		int arr2[] = new int[lenght];
		for (int i = 0; i < arr1.length; i++) {
			arr2[arr1.length-1-i] = arr1[i];

			
				
		}
		
		System.out.println(Arrays.toString(arr2));
		
		scan.close();
		
	}

}
