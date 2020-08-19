package day19arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// lenghti 5 olan integer bir array olusturalim

		int arr[] = new int[5];
		System.out.println(Arrays.toString(arr)); 	// 5 tane 0 verdi cunku default value atatdi.
													// Bir array ile ilgili yapilacak islemler genell;kle Arrays classi
													// uzerinden yapilir.

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(Arrays.toString(arr)); // [1,2,3,4,5] verdi
		System.out.print("For looptan geldi: "); // aralarinda virgul ve koseli parantez yok.
		for (int i = 0; i <= 4; i++) {
			System.out.print(arr[i]);
		}
		// Array de olmayan indexe deger atamasi yapilirsa run time error alinir.
		// Arrayda olmayan indexi kullanmaya calisirsak "ArrayIndexOutOfBoundsException"
	}

}
