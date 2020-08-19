package day17consructors;

public class Constructors01 {
	String name = "Ali Can";
	int age = 33;
	public static void main(String[] args) {
		// Method ile main method ayni class da ise methodun sadece ismini kullanarak cagirabiliriz.
		// Yani object uretmemeize gerek yok.
		buyume (33);
		isimDegistirme("Ayse Han");
		
	}
	public static void buyume (int age) {
		age++;
		System.out.println(age);
	}
	
	public static void isimDegistirme(String name) {
		System.out.println(name);
	}
}
