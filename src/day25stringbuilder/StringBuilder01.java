package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		/* StringBuilder bir classtan stringler uretmeye ve onlari manipule etmeye yarar.
		 * String Classini kullanarak urettiginiz Stringlerde degisiklik yaparsaniz yaptiginiz 
		 * degisiklik ilk uretilen Stringi etkilemez. Bu yuzden Stringler immutable dir.
		 * 
		 * Illa Stringde bir degisiklik yapmak istiyorsaniz ona atama yapmaniz lazim.
		 * 
		 * Ama StringBuilder Classini kullanarak urettiginiz Stringlerde yapilan degisiklikler 
		 * ilk uretilen Stringi de etkiler. Bu yuzden StringBuilder'lar mutable dir
		 * 
		*/
		
		String str = "Ali";
		str.substring(1);
		System.out.println(str); // Ali hic bir degisiklik yok.
		
		// Bir StringBuilder uretmenin 3 farkli yolu vardir.
		
		// 1. yol
		
		StringBuilder strBld1 = new StringBuilder("Mehmet");
		// Value'su "Mehmet" olan bir String urettik.
		strBld1.append("Hakan");
		System.out.println(strBld1);//MehmetHakan
		
		// 2. Yol
		
		StringBuilder strBld2 = new StringBuilder();
		// Bos bir String urettik.
		strBld2.append("Mustafa");
		System.out.println(strBld2);

		// 3. Yol
		
		StringBuilder strBld3 = new StringBuilder(15);
		// Uzunlugu 15 character olan bir StringBuilder urettik.
		// Bu 15 sayisinin hicbir ehemmiyeti yok. Eger girdigimiz deger 15 chardan
		// fazla ise String kendini otomotik olarak uzatir.
		
		strBld3.append("Cekoslovakyalastiramadiklarimiz");
		System.out.println(strBld3);
		
	}

}
