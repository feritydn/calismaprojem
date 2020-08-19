package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kucuk 3 un kati olan sayma sayilarini ekrana yan yana yazdiran for loop olusturunuz.
		
		for(int i =3; i<100; i+=3) {
			
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		// Ilk 5 sayma sayisinin toplamini veren progremi for loop ile yaziniz
		// 1+2 =3, 3+3=6 , 6+4 = 10, 10+5 =15
		// int sum kullanacagiz mutlaka
		// int sum =0; kullanacagiz
		
		int sum =0;
		
		for (int i=1; i<6; i++) {
			
			sum = sum + i;
			
		}System.out.println("Toplam:   " + sum);//15
		
		// 10 dan buyuk ilk 3 sayma sayisini  toplamini veren for loop u yaziniz
		
		int sum1 =0;
		
		for(int i=11; i<14; i++) {
			sum1 = sum1 + i;
			
		}System.out.println("Toplam 2: " + sum1); //36
		
		// 0 dan 100 kadarki 5 e bolunen sayilarin toplami
		
		int sum2=0;
		
		for(int i=5; i<100; i+=5) {
			sum2 = sum2 +i;
		}System.out.println("Toplam 3: "+sum2); // 950
		
		// 20 den buyuk ilk bes sayinin toplamini yapan loop yaziniz.
		
		int sum3 = 0;
		
		for (int i=21; i<26; i++) {
			sum3 = sum3 +i;
			
		}System.out.println("Toplam 4: "+sum3); //115
		
		// ilk 50 sayma sayisinin toplamini verene for loop
		
		int sum4 = 0;
		
		for (int i=1 ; i<51; i++) {
			
			sum4 = sum4+ i;
			
		}System.out.println("Toplama 5: " + sum4);
		
		System.out.println(1275/25);
		
		
		
		
		
		
		
		
		
		
		

	}

}
