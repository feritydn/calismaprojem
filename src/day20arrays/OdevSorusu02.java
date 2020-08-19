package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullanýcýya kaç elemanlý bir array gireceðini sorun.
//		Kullanýcýdan array’in elemanlarýný girmesini isteyin.
//		a) Bu array’in icinde herhangi bir elemanýn var olup olmadigini kontrol edin.
//		b) Bu arayýn tum elemanlarýný tersten yazdýrýn.
//		Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdýrýn.

		// 1. Step ==> Array olusturma
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen kac elemanli bir array olusturacaginiz yaziniz");

		int lenght = scan.nextInt();

		System.out.println("Lutfen array elemanlarini giriniz");

		int arr1[] = new int[lenght];
		
		
		// 2. Step ==> Arraya eleman atama
		for (int i=0; i<lenght; i++) {
			arr1 [i] = scan.nextInt();
			
		}
		
		// 3. Step ==> Atana elemanlari kontrol etme
		System.out.println("Sorttan once: " + Arrays.toString(arr1));
		
		// 4. Step ==> ascending order
		Arrays.sort(arr1);
		System.out.println("Sorttan Sonra: " + Arrays.toString(arr1));
		
		// 5. Step ==> Eleman var mi yok mu kontrol etme
		System.out.println(Arrays.binarySearch(arr1, 2));
		System.out.println(Arrays.binarySearch(arr1, 5));
		
		// 6. Step ==> Array i tersten yazdirma
		int arr2[] = new int [lenght];
		
		for (int i = 0; i<arr1.length; i++) {
			arr2[arr1.length-1-i] = arr1[i];
			
		}
		
		System.out.println("tersten yazilmis hali: " + Arrays.toString(arr2));
		
		scan.close();
		
		
		
		
	}

}
