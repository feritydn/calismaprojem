package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// 4 elemanli Char bir array olusrurun bu arraya 4 elemanli
		// bu arraya elemanlar atayin ve for dongusunde uyazdirin
		// sonra da tersten yazdirin.

		char arr1[] = new char[4];
		arr1[0] = 'M';
		arr1[1] = 'E';
		arr1[2] = 'V';
		arr1[3] = 'A';

		for (int i = 0; i <= 3; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		System.out.print("tersten yazilisi: ");
		
		for (int i=arr1.length-1; i>=0; i--) {
			System.out.print(arr1[i]);
		}
	}

}
