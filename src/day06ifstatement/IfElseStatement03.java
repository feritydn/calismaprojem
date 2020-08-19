package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		// kullanicidan alacagi urun miktarini ve
		// fiyatini alalim.
		// eger kullanici 1000 den fazla urun alirsa %20
		// indirim yapan ve kullanicinin odeyecegi toplam 
		//bir kod yaziniz. 1000 den az veya 1000 urun alirsa 
		// indirim yapmayin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen alaaginiz urun miktarini giriniz.");
		
		double miktar = scan.nextDouble();
		
		System.out.println("Lutfen fiyatini giriniz");
		
		double fiyat = scan.nextDouble();
		
		
		if (miktar >1000) {
			System.out.println((fiyat*80/100)*miktar);
		}else {
			System.out.println(fiyat * miktar);
			
		}
		scan.close();
	}

}
