package day22arraylist;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya
		// for-each loop kullanarak yazd�r�n�z.
		// �pucu: split()
		
		String str = "Sen cal�� olmazsa alem s�k�ls�n";
		
		String str1 [] = str.split("");
		
		for (String w:str1) {
			System.out.println(w);
			
		}

	}

}
