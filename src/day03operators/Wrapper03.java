package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		 //Kullanicidan ad ve soyadini alalim ekrana yazdiralim
        //Kullanicidan adresini alalim ekrana yazdiralim (2. cadde Bakirkoy Istanbul Turkiye)
        //Kullanicidan yasini alalim ekrana yazdiralim.
        //Kullaniciya "Turkiye'de yasiyorum. true/false" diye soralim cevabini ekrana yazdiralim
        //true veya false olarak
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi yaziniz");
		String isim = scan.nextLine();
		System.out.println(isim);

		System.out.println("Lutfen adresinizi yaziniz.");
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("lutfen yasinizi yaziniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Turkiyede yasiyorum. true/false");
		boolean trBl = scan.nextBoolean();
		System.out.println(trBl);
		scan.close();
	}

}
