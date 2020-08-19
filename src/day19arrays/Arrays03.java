package day19arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		
		
		int arr [] = {1, 2, 7, 4, 5, 6} ;
		int count =0;
		for (int i =0; i<6; i++) {
			if(arr[i] == 3) {
				count++;
				
			}
			
			
		}
		if (count >0) {
			System.out.println("3 var");
		}else {
			System.out.println("3 yok");
		}
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen adinizi giriniz");
		String str = scan.nextLine().toUpperCase();
		int lenght = str.length();
		char arr1 [] = new char [lenght];
		
		for (int i=0; i<lenght; i++) {
			arr1 [i] = str.charAt(i);
		}
		Arrays.sort(arr1);
		System.out.println(Arrays.binarySearch(arr1, 'Z'));

		scan.close();
		
	}

}
