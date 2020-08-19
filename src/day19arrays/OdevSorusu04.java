package day19arrays;

public class OdevSorusu04 {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		if (arr1 == arr2) {
			System.out.println("Same");        // not same because the references are different
		}else {
			System.out.println("Not same");
		}

	}

}
