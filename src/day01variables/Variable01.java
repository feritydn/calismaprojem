package day01variables;

public class Variable01 {

	public static void main(String[] args) {
		
		int maas=250;
		System.out.println(maas);          //print yapinca maas degil deger gozukur
		
		System.out.println("ogrenci sayim= " +maas);
		
		String mesaj = "ogreci Sayisi :";
		System.out.println(mesaj + maas );
		
		char ilkHarf= 'a';                // char'da mutlaka '' tek tirnak isareti kullanilir
		System.out.println(ilkHarf);
		
		boolean isNew= true;              // boolean'da sonuc sadece 'true' yada 'false' olur.
		System.out.println(isNew);        // 1 bit alan kaplar
		
		boolean isAge25= false;
		System.out.println(isAge25);
		
		byte zarar= -120;                 // -128 ile 127 arasindaki sayilari kullanabiliriz.
		System.out.println(zarar);       // 8 bit alan kaplar
		
		byte kar=100;                    // - 32000 ile 32000 arasini kapsar
		System.out.println(kar);
		
		short kagizmanNufus=30000;      
		System.out.println(kagizmanNufus);
		
		long yildizSayisi=12345678912345L;  // java sayilari otomatik olarak int kabul eder biz long kullanmak 
		System.out.println(yildizSayisi);   //isitiyorsak sonuna 'l' ya da'L' yazariz.
		
		double pi=3.14454586791257896;     // java ondalik sayilari otomatik olarak double olarak atar
		System.out.println(pi);
		
		float para=4.50F;                  // otomotik olarak double olarak atanan bir datayi float olarak degistirmaek istiyorsak
		System.out.println(para);          // sonuna 'f' ya da 'F' yazilir.
		                                  // ondalik sayilarin default valeu'su 0.0'dir
		
		String ogrenciIsmi= "Ali Can";     // ilk harf buyuk olmali
		System.out.println(ogrenciIsmi);   // non - pirimitive data isimleri buyuk harfle baslar
		
		int zSayiDegeri = 'z';
		System.out.println(zSayiDegeri);
		
		int unlemSayiDegeri = '!';
		System.out.println(unlemSayiDegeri);
		
		int artiSayiDegeri = '+';
		System.out.println(artiSayiDegeri);
		

	}

}
