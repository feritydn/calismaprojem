package day10stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {

		// LastIndexOf() methodu aradigimiz chararcter in string
		//icindeki son gorunumunun index ini return eder.

		//LastIndexOf ( ) method 1. versiyon
		
		String str1 = "Sivrihisar";
		
		System.out.println(str1.lastIndexOf('i')); //6
		// ekrana alti yazdirir. Cunku en son i yi bulur ve son i index return u 6 dir.
		
		System.out.println(str1.lastIndexOf('r')); //9
		
		// LastIndexOf ( ) method 2. versiyon
		
		System.out.println(str1.lastIndexOf('i', 7)); //6
		System.out.println(str1.lastIndexOf('i', 4)); //4 dahildir
		
		// LastIndexOf ( ) method 3. versiyon
		
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); //9

	}

}
