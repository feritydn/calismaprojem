package day09switchoperators;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca  "Ilk harf", B harfini bulunca
		// "ikinci harf" C harfini bulunca "Ucuncu harf  D harfini 
		// bulunca "Dorduncu harf" uyazdiran programi
		// if else if ( ) ve switch () kullanarak yaziniz
		
		char harf = '1';
		
		if (harf == 'A') {
			System.out.println("Ilk harf");
			}else if (harf == 'B') {
				System.out.println("Ikinci harf");
			}else if (harf =='C') {
				System.out.println("Ucuncu harf");
			}else if (harf == 'D') {
				System.out.println("Dorduncu harf");
			}else {
				System.out.println("Bilmiyorum");
			}
		switch (harf) {
		case 'A' :
			System.out.println("Ilk harf");
			break;
		case 'B' :
			System.out.println("Ikinci harf");
			break;
		case 'C' :
			System.out.println("Ucuncu harf");
			break;
		case 'D' :
			System.out.println("Dorduncu harf");
			break;
		default :
			System.out.println("Bilmiyorum");
			
		}
	}

}
