package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// Ekrana 4 defa Ali yazdir
		
		int num = 0;
		
		while (num<4) {
			System.out.print("Ali"+ " ");
			num++;
		}
		System.out.println();
		// While loop kullanarak birden ona kadar tamsayilari ekrana yazdir.
		
		int num2 =1;
		while (num2<11) {
			System.out.print(num2 + " ");
			num2++;
		}
		
		System.out.println();
		// while loop kullanarak 1 den 20 ye jkaadar cift sayilar
		
		int num3 = 2;
		
		while (num3<21) {
			System.out.print(num3 + " ");
			num3+=2;
		}
		
		System.out.println();
		// while loop kullanarak 5 ten 120 kardar 3 ile bolunen
		
		int num4 = 5;
		
		while (num4<121) {
			if (num4 %3 == 0) {
				System.out.print(num4 + " ");
				
			}
			num4++;
		}
		
				

	}

}
