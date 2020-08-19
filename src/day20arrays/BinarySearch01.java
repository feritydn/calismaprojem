package day20arrays;

import java.util.Arrays;

public class BinarySearch01 {

	public static void main(String[] args) {
		
		int arr[]= {2,1,7,6};
		                    // 0 1 2 3
		Arrays.sort(arr);  // {1,2,6,7}
		System.out.println(Arrays.binarySearch(arr, 2)); //1
		System.out.println(Arrays.binarySearch(arr, 7)); //3
		System.out.println(Arrays.binarySearch(arr, 3)); // -3 
		System.out.println(Arrays.binarySearch(arr, 9)); // -5
		
		String str[] = { "A", "C", "B", "D" };
		                    // 0  1  2  3
		Arrays.sort(str);  // {A, B, C, D}
		System.out.println(Arrays.binarySearch(str, "A")); //0
		System.out.println(Arrays.binarySearch(str, "C")); // 2
		System.out.println(Arrays.binarySearch(str, "E")); // -5
		System.out.println(Arrays.binarySearch(str, "G")); // -5
		

	}

}
