package day19arrays;


public class BenimSorum01 {

	public static void main(String[] args) {
		// {1,2,3,4,5,6,7} den olusan bir arayi rakamlarini terse cevirip 2 ile carpiniz
		
		int arr [] = {1,2,3,4,5,6,7};
		String reverse = "";
		for (int i = arr.length-1; i>=0; i--) {
			reverse = reverse + arr[i] + "";
		}
			System.out.println(reverse);
			int num = Integer.valueOf(reverse);
			num = num*2;
			System.out.println("Rakamlarin terse cevrilip 2 ile carpimi: " + num );

	}

}
