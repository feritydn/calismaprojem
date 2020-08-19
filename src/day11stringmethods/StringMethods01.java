package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// startsWith( ) Bir Stringin istenen harfle baslayip
		// baslamadigini kontrol eder.Istenen harfle basliyorsa 
		// true baslamiyorsa false return eder.
		
		String str1 = "Ali Can";
		
		// startsWith () 1. versiyon
		System.out.println(str1.startsWith("A")); // true
		System.out.println(str1.startsWith("B")); // false
		System.out.println(str1.startsWith("a")); // false
		
		System.out.println(str1.startsWith("Ali"));  // true
			// ister bir harf ister birden fazla harfe bakabiliriz.
		
		// statsWith ( ) 2. Versiyon
		
		System.out.println(str1.startsWith("a", 3)); //false
		System.out.println(str1.startsWith("a", 5)); // true
		// 5. index a mi diye soruyoruz.
	
		System.out.println(str1.startsWith("Can", 4)); // true
		
		//endsWith () methodu ==> Bir stringin istenen harfle bitip
		// bitmedigini kontrol eder. istenen harfle bitiyorsa true
		// bitmiyorsa false verir.
				
		String str2 = "Ayse Canan";
				
		System.out.println(str2.endsWith("n"));  //true
				
		System.out.println(str2.endsWith("Canan"));  // true
				
		System.out.println(str2.endsWith("CANAN"));  // false
				
		System.out.println(str2.endsWith(""));  // true cunku n harfinden sonra hic bir sey var.
		System.out.println(str2.endsWith(" ")); // false cunku n harfinden sonra bosluk yok
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" ")); // true
		System.out.println(str3.endsWith(""));  //true
		System.out.println(str3.startsWith(""));//true

	}

}
