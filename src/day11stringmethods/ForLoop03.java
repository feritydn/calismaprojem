package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		
				// ilk 4 sayma sayisinin carpimini veren for loop olusturunuz.
				// 1 , 2, 3, 4 ==> 1*2*3*4 =24
		
		int product1 = 1;
		
		for(int i =1; i<5; i++) {
			
			product1 = product1*i;
			
		}System.out.println("Carpim 1: " + product1);
		
		// ilk 6 cift sayma sayisinin carpimi
		
		int product2 = 1;
		
		for(int i =2; i<=12; i+=2) {
			product2 = product2*i;
			
		}System.out.println("Carpim 2: " + product2);

		
		// Matematikten birer birer geri gelip saymaya faktoriyel denir
		// bu interview sorusudur.
		// 9! bulan bir for loop yaziniz
		
		int product3 = 1;
		
		for (int i=9; i>0; i--) {
			product3 = product3 *i;
		}System.out.println("9! =  :" + product3);
	}

}
