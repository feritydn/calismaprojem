package day10stringmethods;

public class Odev04 {

	public static void main(String[] args) {
		
		String strA = "Cat ";
		
		System.out.println(strA.trim()); //Cat
				
		String strB = " Cat";
				
		System.out.println(strB.trim()); //Cat
		
		String strC = " Cat ";
		
		System.out.println(strC.trim()); //Cat
		
		String strA1 = "Cat";
		
		System.out.println(strA1.contains("a")); // true
		
		String strB1 = " Cat";
		
		System.out.println(strB1.contains(" ")); // true
		
		String strC1 = "Cat";
				System.out.println(strC1.contains("")); // true

	}

}
