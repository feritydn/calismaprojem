package day22arraylist;

public class OdevSorus03 {

	public static void main(String[] args) {
		// Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz
		
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
