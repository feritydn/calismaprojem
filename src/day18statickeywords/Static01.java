package day18statickeywords;

public class Static01 {

	static int en = 12;
	static int boy = 10;
	static int alan; //int alan = en *boy;
	static int yaricap =4;
	static double pi;
	static {
		alan = en*boy;
		pi = 3.14;
		// eger bir variableyi olustururken hesap yapmamiz gerekirse 
		//"Static block" olusturmak iyidir. Yani "int alan = en*boy" demek yerine
		// "Static block" olusturup onun icine yazmak daha iyidir.
		
		// "static block" variablelere deger atamak icin de kullanilabilir.
		// "static block" class olusturuldugu zaman olusturulur. En basta olmasi lazim.
		// degistirilmesini istemedigimiz varaiableleri burada olusturabiliriz.
		// "staic block" tum methodlardan ve constructorlardan once calistirilir.(Main method dahil)
		// birden fazla "static block" varsa ustteki once calisir.
		// Static block butun method ve constructorlarin disina classin icine yazilir.
	}
	public static void main(String[] args) {

		

	}
	
	static class InnerClass {
		// Stataic class olabilir ama sadece inner classlar yani alt classlar stataic olabilirler
		// outer yani ust classlar static olamazlar.
	}

}
