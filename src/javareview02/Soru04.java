package javareview02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/* 
		scanner kullanarak a�a��daki sorulara cevaplar isteyiniz

	    1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
		2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
		3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
		         Harun
		         Ekinci
		4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
		         1983
		         2020	     
        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z 		
		        "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
		6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, 
		isim ve soyisim karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
		   //�ifre= 37HEi56        
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println(" Lutfen adinizi giriniz");
		String name = scan.nextLine();
		
		System.out.println("Lutfen soy adinizi giriniz.");
		String surname = scan.nextLine();
		
		System.out.println("Lutfen dogum yilinizi giriniz");
		int dogum = scan.nextInt();
		
		System.out.println("Lutfen bu yili yaziniz");
		int year = scan.nextInt();
		int yas = year - dogum;
		System.out.println(name + " " + surname + " "+ (year - dogum) );
		
		System.out.println("Sifre: " + yas + name.charAt(0) + surname.charAt(0) + name.charAt(name.length()-1)+ 
							surname.charAt(surname.length()-1)+ name.length() + surname.length());
scan.close();

	}

}
