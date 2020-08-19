package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki array olusturup bu arraylarin bir birine esit olup olmadigini
		// kontrol ediniz.

		// Not: Iki arrayin esit olabilmesi icin;
		// 1) elemanlar ayni olmali
		// 2) esit elemanlarin index numaralari da ayni olamli

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };
		
		System.out.println(arr1 == arr2); // false aliriz cunku reference lari farkli
		
		// esitligi kontrol etmek icin equals kullanilir
		System.out.println(arr1.equals(arr2)); // yine false aliriz cunku arrays methodu icinde kullanmamiz lazim.
		
		System.out.println(Arrays.equals(arr1, arr2)); // true aliriz.
		// Arrays.equals() methodu sadece degerlere bakar referencelere bakmaz.
	}

}
