package day24varargsaccessmodifier;

public class Varargs01 {

	public static void main(String[] args) {
		// Varargs ==> Argument variables demektir.
		// Varargs ==> Bir method olusturdugumuzda istedigimiz kadar argumet girmemizi saglar.
		// 
		countName(1,2,3,4,5,6,7,8,9);
		sum(1,2,3,4,5,6,7,8,9);
		printName("Ali", "Ahmet", "Ayse", "Can", "Canan");
	}
	public static void countName (int ...a) {
		System.out.println("Girilen sayi adedi: "+a.length);
		
	}
	
	public static void sum (double ...b) {
		double sum =0;
		for (double w:b) {
			sum = sum+w;
		}
		System.out.println("Sayilarin toplami: "+sum);
	}
	
	public static void printName (String ...n) {
		for (String w:n) {
			System.out.print(w + " ");
		}
		
	}
}
