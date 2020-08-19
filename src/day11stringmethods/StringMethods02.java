package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		
		// substring () methodu bir Stringin belli bir bolumunu kesip 
		//almak icin kullanilir.
				
		String str1 = "Java calisana kolaydir";
				
		// subsitring () 1. versiyon
		System.out.println(str1.substring(5)); //calisana kolaydir (// 5 indexinden sonra basliyor. 5 dahildir)
		
		System.out.println(str1.substring(8)); // isana kolaydir
		System.out.println(str1.substring(22)); // hicbir sey yazmaz. 1 fazla olunca hicbir sey yazmaz. 2 ve daha fazlasi exception
		System.out.println(str1.substring(0)); // kullanmak mantikli degil cunku Stringle ayni
		
		// substring 2. versiyon
		
		System.out.println(str1.substring(5,13));  // calisana 
			// bitiris icin bir sonrasini diyoruz.
			// ilk index dahil ikinci index dahil degildir.[5,13)
		System.out.println(str1.substring(6,12)); //alisan
		System.out.println(str1.substring(6,6)); // 
			// ekranda hicbir sey goremeyiz
		System.out.println(str1.substring(3,6)); // a c
			// ilk rakami buyuk yazarsak exception verir.
		
		

	}

}
