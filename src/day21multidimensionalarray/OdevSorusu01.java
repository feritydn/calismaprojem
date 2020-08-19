package day21multidimensionalarray;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// A�a��daki multi dimensional array�in tum elemanlar�n�n �arp�m�n� ekrana yazd�ran bir program yaz�n�z.
		//{ {1,2,3}, {4,5,6} }
		
		// 1. Step == > Array olustur
		
		int arr1 [] [] = {{1,2,3},{4,5,6}};
		
		// 2. Step ==> Arrayin elemanlarini carpmak icin for loop olustur
		
		int product = 1;
		
		for (int i =0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				product = product * arr1[i][j];
			}
		}
		
		// 3. Step ==> Sonucu ekrana yazdir
		
		System.out.println(product); // 720

	}

}