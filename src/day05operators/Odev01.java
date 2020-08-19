package day05operators;

public class Odev01 {

	public static void main(String[] args) {
		
		int numA = 2;
		int numB = 3;
		String str1 = "Cok";
		String str2 = "Calis";
		
		// A ==> Ekrana Cok Calis yazdir.
		System.out.println(str1 + " " + str2);
		
		// B ==> ekrana 5 Cok yazdir.
		System.out.println(numA + numB + " Cok");
		
		// C ==> Calis23 yazdir.
		System.out.println(str2 + 2 + 3);
		
		// D ==> ekrana Cok1 yazdir.
		System.out.println(str1 + (numB - numA));

	}

}
