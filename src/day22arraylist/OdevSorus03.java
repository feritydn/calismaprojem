package day22arraylist;

public class OdevSorus03 {

	public static void main(String[] args) {
		// �ki String array olu�turunuz ve bu array�lerdeki ortak elemanlar�
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		// Ortak eleman yoksa ekrana �Ortak eleman yok� yazd�r�n�z
		
		String arr1 [] = {"Ali", "Ata", "Bak"};
		
		String arr2 [] = {"Ali", "Topu", "Tut"};
		int count =0;
		for (String w:arr1) {
			for (String f:arr2) {
				if (w==f) {
				System.out.println("Ayni eleman: " + w);
				count++;}
			}
		}
		
		if (count ==0) {
			System.out.println("Ayni eleman yok!");
		}
		

	}

}
