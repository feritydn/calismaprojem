package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integer Arrayin elemanlarini kucukten buyuge diziniz ve ekrana
		// iki durumu da yazdiriniz.

		int arr[] = { 2, 11, 0, 23, 7, 'A' };

		// Assending order ve natural order
		System.out.println("Siralamadan once: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr));

		// Soru : Char'lardan olusan bir array olusturun ve "ascending order" yapiniz.

		char arr1[] = { 'f', 'e', 'r', 'i', 't' };
		System.out.println("Siralamadan once: " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr1));
		// ASCII degerine gore alir ve once buyuk sonra kucuk harfler siralanir.

		// Soru : Stringlerden olusan bir array olusturun ve ascending order yapin.

		String arr2[] = { "Ankara", "Roma", "New York", "Istanbul" };
		System.out.println("Sralamadan once: " + Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr2));
		// Siralama alfabetik siralamaya gore yapilir ve yapilirken su goz onunde bulunur 
		// Buyuk harfler her zaman kucuk harflerden once gelir. Mesela ZeYnep kelimesi Zen kelimesinden once gelir
		
		// Sort methodu boolean lar icin kullanilamaz. Kullanirsak CTE aliriz.
		
	}

}
