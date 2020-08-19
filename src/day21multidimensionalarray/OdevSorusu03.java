package day21multidimensionalarray;

public class OdevSorusu03 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını
		//ekrana yazdıran bir program yazınız
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		
		int  arr1[] [] = {{1,2}, {3, 4, 5},{6}};
		
		int arr2 [] [] = { {7,8,9}, {10,11}, {12} };
		
		int num1 = arr1 [0][0] + arr2 [0][0];
		int num2 = arr1 [0][1] + arr2 [0][1];
		int num3 = arr1 [1][0] + arr2 [1][0];
		int num4 = arr1 [1][1] + arr2 [1][1];
		int num5 = arr1 [2][0] + arr2 [2][0];
		
		int sum1 =  num1 + num2+ num3+num4+num5;
		
		System.out.println(sum1);
		
		

	}

}
