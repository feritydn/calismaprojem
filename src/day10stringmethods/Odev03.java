package day10stringmethods;

public class Odev03 {

	public static void main(String[] args) {
		
		String str = "Cat, caterpillar";
		
		System.out.println(str.toUpperCase()); // CAT, CATERPILLAR
		
		System.out.println(str.toLowerCase());  // cat, caterpillar
		
		System.out.println(str.substring(4).toLowerCase()); //caterpillar
		
		System.out.println(str.substring(3,8).toUpperCase()); // , CAT
		
		System.out.println(str.toUpperCase().toLowerCase()); // cat, caterpillar

	}

}
