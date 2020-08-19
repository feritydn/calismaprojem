package day17consructors;

public class Constructors02 {

	public static void main(String[] args) {
		/*
		 * Buyume methodu bu classda degil Constructors01 classinda bu yuzden Java kullanmamiza izin vermiyor.
		
		eger siz baska bir classdan bir methodu kullanmak istiyoraniz o classdan bir object olusturup sonra 
		istediginiz kadar kullanabilirsiniz.Bu reusebllty konusunda oldukca onmelidir.
		 */
		Constructors01 obj1 = new Constructors01 ();
//		obj1.buyume(25);
//		obj1.isimDegistirme("fatma Can");
		
		/* 
		 * Java sari uyari veriyor cunku buyume ve isimDegistirme methodlari static. Biz static bir methodu object
		 * olusturmadan da direkt classin ismini yazarak cagirabiliriz. javada sari uyarilarin anlami yaparim ama tavsiye etmem.
		 */
		Constructors01.buyume(35);
		Constructors01.isimDegistirme("fatma San");
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		/*
		 * Bir variable ya da method static ise o variableye object olusturmadan sadece class ismini yazarak da ulasabiliriz.
		 */
		
		System.out.println(Constructors03.kilo);
		System.out.println(Constructors03.surname);
		Constructors03.artirma(35);
		Constructors03.nameDegistir("Bolat");
		
	}

}
