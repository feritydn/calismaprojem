package day16overloading;


public class Overloading01 {

	public static void main(String[] args) {
		/*
		 * Overloading kelime anlami olarak asiri yukleme demektir.
		 * 
		 * iki sayinin toplamini ekrana yazdirna method yaziniz
		 */	
		
		toplama(10,20);    	   	//===> 1. method
		toplama(10,20,30); 	  	//===> 2. method
		toplama(10.5,20);		//===> 3. method
		toplama(10,20.5);		//===> 4. method
		
		/*
		 * Method Body kismini degistirmek yeterli olmadi
		 * 				OVERRIDING YAPMA YOLALRI
		 * 1) Parametrelerin sayisini degistirerek ayni isimda methidlar olusturabiliriz.
		 * 2) Parametrelerin sayisini degistirmeden parametrelerin data typeni degistirerek de
		 *    ayni isimli methodlar olusturabiliriz.
		 *    NOTE: (10,20) eger iki parametresi de int olan method varsa onu secer eger yoksa double olani secer.
		 * 3) Farkli data typelarindaki parametrelerin de yerleri degistirilerek ayni isimli methodlar olusturabilirz.
		 */
	}

	//1. Method
	public static void toplama(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	// 2. Method
	public static void toplama(double num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	// 3. Method
	public static void toplama(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	//4.Method
	public static void toplama(int num1, double num2) {
		System.out.println(num1 + num2);
	}
}
