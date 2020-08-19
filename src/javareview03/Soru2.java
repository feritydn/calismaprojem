package javareview03;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

//      Asagidaki sonuc nedir?
//      int harf = '1';
//      char ch = '2';
//
//     System.out.println(harf+ch); //12 mi?, 3 mu? 99 mu?
//
//      System.out.println(harf); // 1 mi? 49 mu?
//
//      System.out.println(ch); // 2 mi? 50 mi?
//
//      char deneme = 50;
//
//      System.out.println(deneme); // 2 mi? 50 mi?
//      
//      int unlem = '!';
//      System.out.println("unlem :" + unlem);
//      int yuzde = '%';
//      System.out.println("yuzde :" +  yuzde);
//      int asteriks = '*';
//      System.out.println("asteriks :" + asteriks);
//      int dolar = '$';
//      System.out.println("dolar :" + dolar);
//      int et = '@';
//      System.out.println("et :" + et);
//      int end = '&';
//      System.out.println("end :" + end);
		
		
		//int ve long data tipinin maximum ve minimum degerlerini bulup ekrana yazdiriniz.
		
	// kodu dinamik olarak yaz	
		
//		System.out.println("Integer.MAX_VALUE: "+ Integer.MAX_VALUE);
//		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
//		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
//		System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE);
    		  

		// Interview sorusu
		// iki taner variablenin yerini degistirme
		
		int num1 = 25;
		int num2 = 15;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
		//Kullanicidan iki farkli kelime yazsin - (String) olarak
		//Program  bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
		/* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
		kullaniriz. next() tek kelimelik String'ler icin kullanilir.
		Space gorunce String'i almayi birakir.
		nextLine() girilen tum String'i almak icin kullanilir.*/
		
		Scanner scan = new Scanner (System.in);
//		
//		System.out.println("Birinic kelimeyi giriniz");
//		String str1 = scan.next();
//		System.out.println("Ikinci kelimeyi giriniz");
//		String str2 = scan.next();
//		String unlem = "!";
//		System.out.println(str1 + " " + str2 + " " + unlem);
		
		
		/*
		  Kullanici  iki sayi girsin 
		  Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
		  Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
		  ve sonucunu ekrana yazdirsin. //
		  Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
		  Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
		*/
//		System.out.println("ilk sayisi giriniz ");
//		int num1 = scan.nextInt();
//		System.out.println("Ikinci sayisi giriniz");
//		int num2 = scan.nextInt();
//		
//		int ilkKare = num1*num1;
//		int ikiKare = num2*num2;
//		int besIlk = num1*5;
//		int besIki = num2*5;
//		
//		System.out.println(" ilk sayinin karesi ; " +ilkKare);
//		System.out.println(" ikinici sayinin karesi ; " + ikiKare);
//		System.out.println(" ilk sayinin 5 ile carpimi ; " + besIlk);
//		System.out.println(" ikinici sayinin 5 ile carpimi ; " + besIki);

		/* Operators
		1)Parantez ici islemler yapilir
		2)Carpma ve bolmeler yapilir.Carpma ve bolmeden soldaki once yapilir.
		3)Toplama ve cikarmalar yapilir.Toplama ve cikarmadan soldaki once yapilir.
		*/
		     int i1 = 23;
		     int i2 = 15;
		     int i3 = 38;
		     int i4 = 14;
		    System.out.println( i1 + i2*i3);    //593
		    System.out.println(i1*i2 + i3*i4);  // 877
		    System.out.println((i1+i2)/i4); 
		    System.out.println(i4 * (i2 + i1 / 3 ));
		    
		    scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
	}

}
