package javareview01;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		
		//Scanner ile kullanıcıdan 3 tamsayı girmesini 
		//isteyin ve bu sayıların toplamını yazdırınız.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 3 tam sayi giriniz.3");
		// int atamayi soyle de yapabiliriz ==> int numA, numB, numC ....
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		
		System.out.println(numA + numB + numC);
		
		scan.close();
	}

}
