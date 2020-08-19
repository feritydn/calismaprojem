package day17consructors;

public class Constructors04 {
	static int num1 = 12;
	       int num2 = 13;
	public static void main(String[] args) {
		/*
		 * Static methodlarin icinde sadece static variableler kullanilabilir.
		 * eger biz burada num2'yi kullanmaya calisirsak scope durumundan dolayi 
		 * Compile time error aliriz. Ama eger num1'i kullanirsak static oldugu icin
		 * hic bir problem yasamayiz. 
		 * num2++; ==>CTE
		 */
		num1++; // ==> Problem yok
	}

}
