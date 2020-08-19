package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		int arr[] = {12,21,13,43};

		// for loop kullannarak elemanlari ekrana yazdir.
		
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println("====");
		
		// for each loop kullanarak elemanlari ekrana yazdir
		
		for (int w: arr) {
			System.out.print(w + " ");
		}
		
		// String iceren bir array olusturun  elemanlarinin yan yana 
		// aralarina bosluk koyarak for each ile yazdirin
		
		System.out.println("====");
		String arr1 [] = {"Suzan Meva", "Zeynep", "Ferit", "Aile" };
		
		for (String w: arr1) {
			System.out.print(w + ", ");
			
		}
		
		
		// int elemnalar iceren bir list olusturunn ve for each loop kullanarak
		// bu elemanlarin toplamini ekrana yazdirin.
	
		System.out.println("====");
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(10);
		list2.add(15);
		list2.add(20);
		list2.add(-100);
		
		int sum =0;
		
		for (int w:list2) {
			sum = sum+w;
		}
		System.out.println("Elemanlarin Toplami:  " + sum);
		
		
		// {{1,2},{5},{6,7,8}} arrayindaki tum elemanlarin toplamini bulunuz
		
		int arr3 [] [] = {{1,2},{5},{6,7,8}};
		int sum2 = 0;
		for (int [] w: arr3) {
			for (int f: w) {
				sum2 = sum2 +f;
				
			}
			
			
		}
		System.out.println(sum2);
	
	
	
	
	
	
	
	}

}
