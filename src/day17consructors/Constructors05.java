package day17consructors;

public class Constructors05 {

	public static void main(String[] args) {
		// Class Constructors04'ten num1 ve num2'yi cagiralim
		
		Constructors04 obj1 = new Constructors04();
		System.out.println(obj1.num2);			 // Num2 stataic olmadigi icin obje kullanarak
												 // cagirmak zorundayiz. Aksi takdirde ulasamayiz.
		System.out.println(Constructors04.num1); // num1 stataic oldugu icin herhangi bir objeye  
												 // ihtiyac duymadan sadece sinif ismi ile cagirabildik.

	}

}
