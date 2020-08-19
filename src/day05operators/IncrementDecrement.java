package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data type de bir variable olusturun.
		// bu variablenin degerini carpma ve bolme  kullanarak
		// artirin ve azaltin.
		
		int num1 = 15;
		
		// uzun yol ile carpma yaparak increment
		
		num1 = num1*3;
		System.out.println(num1);
		
		// kisa yol
		
		num1 *= 3;
		System.out.println(num1);
		
		// uzun yol ile bolme yaparak decerement
		
		num1 = num1 / 5;
		System.out.println(num1);
		
		// kisa yol
		
		num1 /= 3;
		System.out.println(num1);
		
		

	}

}
