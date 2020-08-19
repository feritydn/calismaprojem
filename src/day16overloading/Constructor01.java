package day16overloading;

public class Constructor01 {
	int price = 200;
	int year = 2020;
	String model = "Civic";
	String make = "Honda";
	public static void main(String[] args) {
		// Classi kullanip obje ureten seye constructor denir.
		// Turkce karsiligi muteahittir.
		// Constroctor bir methot yada variable degildir. Classtan bir;ey 
		// uretmemize yarayan code blocktur.
		
		/* OZELLIKLERI
		 *  1) Return Type lari yoktur
		 *  2) Class ismi ile ayni ismi kullanmak zorundalar
		 *  3) Classin icinde olmak zorundalar.
		 */
		
		/* Class olusturdugumuzda java otomatik olarak bir adet constructor olusturur.
		 * Biz herhangi bir code yazmadan bu constructoru kullanabiliriz. Bu constructora
		 * default constructor denir. Default Constructorlarda parametre bulunmaz.
		 *  Biz her hangi bir constructor olusturusak java bu default constructoru imha eder.
		 */
		
		Constructor01 newHonda = new Constructor01(); // Bir obje urettik
		System.out.println("New Honda Price: " + newHonda.price);
		System.out.println("New Honda Year : " + newHonda.year);
		System.out.println("New Honda Model: " + newHonda.model);
		System.out.println("New Honda Make : " + newHonda.make );
	}

}
