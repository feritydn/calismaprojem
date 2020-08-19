package day10stringmethods;

public class Odev01 {

	public static void main(String[] args) {
		
		String str = "Cat, caterpillar";
		
		System.out.println(str.lastIndexOf("a")); //14
		
		System.out.println(str.lastIndexOf("at")); //6
		
		System.out.println(str.lastIndexOf("s"));  // -1
		
		System.out.println(str.lastIndexOf("CAT")); // -1
		
		System.out.println(str.lastIndexOf("pars")); // -1
		
		System.out.println(str.lastIndexOf("a" , 3 )); //1 
		
		System.out.println(str.lastIndexOf("a" , 5 )); //1
		
		System.out.println(str.lastIndexOf("at", 2)); //1
		
		System.out.println(str.lastIndexOf("at", 7)); //
		
		

	}

}
