package day14dowhileloop;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// 9 den 190 e kadar 7 nin kati olan t�m tamsay�lar� ekrana yazd�r�n�z.
		
		int num = 9;
		
		do {
			if (num%7==0) {
				System.out.print(num + " ");
			}
			
			num++;
		}while(num<=190);

	}

}
