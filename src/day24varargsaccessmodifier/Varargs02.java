package day24varargsaccessmodifier;

public class Varargs02 {

	public static void main(String[] args) {
		/*
		 * 					Varargs yanlis kullanimlari
		 * 1) Varargs her zaman son parametre olmalidir. Eger son parametre degilse bir sonraki parametreye gecemeyiz
		 * 	  Bu bir hatadir. Ve java bu durumda bize CTE verir.
		 * 2) Parametre olarak birden fazla varargs kullanmayiz hatta data typelari farkli bile olsa kullanamayiz. Eger kullanirsak
		 *    yine CTE aliriz.	
		 */
		
		valueChar("valueChar: ", 'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','r','s','t','u','v','y','z','x','w','q');
		product (1,2,3,4,5,6,7,8,9);
	}

	public static void valueChar (String str, char ... a) {
		int sum =0;
		for (char w:a) {
			sum = sum +w;
		}
		System.out.println(str + sum);
	}
	
	public static void product (int ...x) {
		int product = 1;
		for (int w:x) {
			product = product*w;
		}
		System.out.println("product: " + product);
	}
}
