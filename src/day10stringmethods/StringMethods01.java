package day10stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {

		// indexOf () methodu Stringin icindeki karakterin yerinin
		// belirlemek icin kullanilir.
		
		// indexOf( ) methodu 1. versiyonu
		String str1 = "Javva World";
		
		System.out.println(str1.indexOf('v')); //2
		
		// 2 verir cunku index her zaman 0 dan ba;lar ve bu ornekte ilk v harfinin indexini verir.
		
		System.out.println(str1.indexOf('W')); //6
		// 6 verir cunku space de bir karakterdir.
		
		System.out.println(str1.indexOf('w')); // -1
		// -1 verir cunku java case sensetive oldygundan kucuk buyuk harfi ayri kabul eder
		// olmayan bir deger giridigimizde -1 sonucunu return eder.
		
		System.out.println(str1.indexOf('a')); //1
		// cunku java sagdan sola calisir ve buldugu ilk a harfinde durur.
		
		
		// indexOf() methodu 2. versiyonu
		System.out.println(str1.indexOf('a',3)); // 4
		// buradaki 3 rakami index aramaya 3 dahil basla demek.
		// return 4 cunku 3 indexinden sonraki ilk a harfinin indexi 4
		
		System.out.println(str1.indexOf('a',4)); // 4
		System.out.println(str1.indexOf('a',1)); // 1
		System.out.println(str1.indexOf('a',5)); // -1
		
		// "Alamanya" Stringidenki ikinci 'a' character inin indexini bulunuz.
		
		String str2 = "Almanya";
		
		System.out.println(str2.indexOf('a'));
		int idx = str2.indexOf('a');
		System.out.println(str2.indexOf('a',idx+1));
		
		// indexOf ( ) methodunun 3. versiyonu
		
				String str3 = "Missisippi"; 
				
				System.out.println(str3.indexOf("is")); //1
				System.out.println(str3.indexOf("si")); //3
		
		
		
	}

}
