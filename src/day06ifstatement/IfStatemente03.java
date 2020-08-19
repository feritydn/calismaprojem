package day06ifstatement;

public class IfStatemente03 {

	public static void main(String[] args) {
		
		
		// bir Char variable olusturun ve bir buyuk harf deger atayin.
		// eger atana deger haftanin gunlerinden herhangi birinin bas ise
		// o gunleri yazdirin
		// degil ise "boyle bir gun yok"
		
		char harf ='Z';
		
		if (harf=='P') {
			System.out.println("Pazar, Pazartesi, Persembe");
			
		}
		if (harf == 'C') {
			System.out.println("Cuma, Cumartesi, Carsamba");
			
		}
		if (harf =='S') {
			System.out.println("Sali");
			
		}
		if (harf !='P' && harf !='C'  && harf !='S') {
			System.out.println("Boyle bir gun yok");
			
		}

	}

}
