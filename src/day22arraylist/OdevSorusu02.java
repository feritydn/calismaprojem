package day22arraylist;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin toplam�n�
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		              //   
		int arr1 [] [] = {{1,2},{3,4,5},{6,7,8},{9,10},{11,12,13}}; //819
		
		int sum = 0;
		
		for (int [] w:arr1) {
			for (int f:w) {
				sum = sum+f*f;
			}
			
		}
		System.out.println("Elemanlarin karelerinin toplami: " + sum);

	}

}
