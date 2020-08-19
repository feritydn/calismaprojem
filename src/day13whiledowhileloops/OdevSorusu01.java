package day13whiledowhileloops;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz.
		
		System.out.println("For loop ile cozum");
		
		for (int i =8; i<=80; i++) {
			if (i%5 ==0) {
				System.out.print(i + " ");
				
			}
		}
		System.out.println();
		System.out.println("While loop ile cozumu");
		
		int num =8;
		
		while (num<=80) {
			if (num%5 ==0) {
				System.out.print(num + " ");
				
				}
			num++;
		}

	}

}
