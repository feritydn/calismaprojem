package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
//		Kullan�c�ya ka� elemanl� bir array girece�ini sorun.
//		Kullan�c�dan array�in elemanlar�n� girmesini isteyin.
//		a) Bu array�in tum elemanlar�n� ekrana yazd�r�n.
//		b) Bu aray�n son eleman�n� ilk eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n.
//		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazd�r�n.
		
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
