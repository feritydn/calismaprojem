package javareview02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/* 
		scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz

	    1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
		2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
		3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin
		         Harun
		         Ekinci
		4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin
		         1983
		         2020	     
        5.Adým Raporu aþaðýdaki gibi yazdýrýnýz 		
		        "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
		6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi, 
		isim ve soyisim karakter uzunluklarýný içeren bir þifre oluþturunuz
		   //Þifre= 37HEi56        
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
