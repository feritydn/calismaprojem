package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		/* 
		 * Bir classta urettigimiz objecti baska bir classtan cagirabiliriz.
		 * Bu object uzerinden oynamalar yapabilir ve ona yeni degerler atayabilirz.
		 * Yanliz bu atana degerler gecici olur eger kalici bir degisim istiyorsak gidip onu
		 * orjinal classindan degistirmemiz lazim.
		 */
		
		Constructor01 toyotaCar01 = new Constructor01();
		System.out.println("Toyota make  : " + toyotaCar01.make.replaceAll("Honda", "Toyota"));
		System.out.println("Toyota model : " + toyotaCar01.model.replaceAll("Civic", "Yaris"));
		System.out.println("Toyota year  : " + (toyotaCar01.year + 1));
		System.out.println("Toyota price : " + (toyotaCar01.price + 1000) );

	}

}
