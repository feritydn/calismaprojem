package day22arraylist;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// Bir integer array oluþturunuz ve bu array’deki tum sayýlarýn çarpýmýný
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		
		int arr1 [] [] = {{1,2},{3,4,5},{6,7,8},{9,10},{11,12,13}};
		
		int product = 1;
		
		for (int [] w: arr1) {
			
			for (int f:w) {
				product = product*f;
			}
			
		}
		
		System.out.println("Elemanlarin carpimi: " + product);
	}

}
