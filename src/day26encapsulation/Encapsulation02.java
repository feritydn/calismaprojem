package day26encapsulation;

public class Encapsulation02 {
	private char ilkHarf = 'F';
	
	private double para = 25.50;
	

	private boolean basarili = true;
	
	// private olarak olusturdugumuz bir variableye atadigimiz degerin degistirlimesini istemiyorsak
	// o deger icin setter() method olusturmayiz. setter() methodu olmayan classlar degistirilemezler.
	// bu classlara "immutable class" denir.
	
	// private olarak olusturdugumuz bir variableye atadigimiz degerin okunmasini istemiyorsak o
	// deger icin getter() methodu olusturmayiz. Boylece bu deger okunmamis olur.
	
	
	public static void main(String[] args) {
		Encapsulation01 encapsulation01 = new Encapsulation01();
		encapsulation01.setIdNo("300000000");
		encapsulation01.setCardNo(50000);
		encapsulation01.setEmekli(true);
		System.out.println("Yeni ID no: "+encapsulation01.getIdNo());
		System.out.println("Yeni card No: "+encapsulation01.getCardNo());
		System.out.println("Yeni emekli: "+encapsulation01.isEmekli());
		System.out.println();

	}
	
	/*Yukarida belirtilen instance ler icin;
	 *        1. Ilk harf okunsun ama degistirilemezsin.
	 *        2. para degistirlsin ama okunmasin.
	 *        3. basarili hem okunsun hem degistirilsin.
	 * 
	 */
	public char getIlkHarf() {
		return ilkHarf;
	}

	public boolean isBasarili() {
		return basarili;
	}
	
	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
		
	}

	public void setBasarili(boolean basarili) {
		this.basarili = basarili;
	}


}
