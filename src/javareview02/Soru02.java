package javareview02;

public class Soru02 {

	public static void main(String[] args) {
		// //*** interview question***
	     // Verilen iki de�eri ���nc� bir de�er kullanmadan yerlerini de�i�tiriniz
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
	       
	       x = x+ y;   // x ==> 60
	       
	       y = x - y;  // y ==> 50
	       
	       x = x - y;  // x ==> (60 -50) 10
	       
	       System.out.println(x);
	       System.out.println(y);
	}

}
