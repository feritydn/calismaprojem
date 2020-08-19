package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		
		// bir int variable olusturun deger atayin
		// eger cift sayi ise ekrana cift yazdirin
		// deger tek sayi ise ekrana tek yazdirin.
		
		int num = 30;
		
		if (num%2==0) {
			
			System.out.println("Cift sayi");
		}
		if(num%2 !=0) {
			
			System.out.println("Tek sayi");
		}

	}

}
