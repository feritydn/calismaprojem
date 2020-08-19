package javareview02;

public class Soru01 {

	public static void main(String[] args) {
		
		// verilen iki sayının yerlerini değiştiriniz
        
		int num1 = 11; // ==>33
        
		int num2 = 33;// ==>11
		
		int gecici = 0;
		
		gecici = num1;
		num1 = num2;
		num2 = gecici;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		
			}

}
