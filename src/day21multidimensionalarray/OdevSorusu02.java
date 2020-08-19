package day21multidimensionalarray;

import java.util.Arrays;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// 2) Aþaðýdaki multi dimensional array’in iç array’lerindeki son elemanlarýn çarpýmýný ekrana yazdýran
		// bir program yazýnýz { {1,2,3}, {4,5}, {6} }
		
		// 1. Step ==> Array olustur ve dogrulugunu kontrol et.
		
		int arr1 [] [] = {{1,2,3}, {4,5}, {6}};
		
		System.out.println(Arrays.deepToString(arr1));
		
		// 2. Step ==> uzunlugu arr1.lenght olan bir array olustur.
		
		int lenght = arr1.length;
		
		
		// 2. Step ==> olusturdugun bu  array e butun ic araylarin son elemanini atayacak bir for loop olusutur.
		
		int product =1;
		for (int i =0; i<lenght; i++ ) {
			product= product * arr1[i][arr1[i].length - 1];
		}
		
		// 3. Step ==> Sonucu ekrana yazdir
		
		System.out.println("Son elemanlarin carpimi: " + product);
		
	}

}
