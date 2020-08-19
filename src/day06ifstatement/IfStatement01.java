package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
		
		// if statement yazmak icin "if () {}" yapilir.
		// condition kelimesi cok onemli.
		
		// bir int variable olusturun ve ona bir deger atayin
		// eger atadiginiz deger pozitif ise ekrena "pozitif" yazdirin
		// eger atadiginiz deger negatif ise ekrana "negatif" yazdirin.
		
		int num = -15;
		
		if (num >0) {
			System.out.println("Pozitif");
			
		}
		if (num<0) {
			System.out.println("Negatif");
			
		}

	}

}
