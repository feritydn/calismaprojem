package day22arraylist;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
		// for-each loop kullanarak yazdýrýnýz.
		// Ýpucu: split()
		
		String str = "Sen calýþ olmazsa alem sýkýlsýn";
		
		String str1 [] = str.split("");
		
		for (String w:str1) {
			System.out.println(w);
			
		}

	}

}
