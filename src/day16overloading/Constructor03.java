package day16overloading;

public class Constructor03 {

	String name = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation tester";
	boolean emekli = false;

	public static void main(String[] args) {

		System.out.println("Insan 01");
		Constructor03 insan01 = new Constructor03();
		System.out.println("isim: " + insan01.name);
		System.out.println("yas: " + insan01.yas);
		System.out.println("kilo: " + insan01.kilo);
		System.out.println("meslek: " + insan01.meslek);
		System.out.println("emekli: " + insan01.emekli);
		System.out.println("Insan 02");
		Constructor03 insan02 = new Constructor03(25);
		System.out.println("isim: " + insan02.name);
		System.out.println("yas: " + insan02.yas);
		System.out.println("kilo: " + insan02.kilo);
		System.out.println("meslek: " + insan02.meslek);
		System.out.println("emekli: " + insan02.emekli);
		System.out.println("Insan 03");
		System.out.println("Insan 03");
		Constructor03 insan03 = new Constructor03("Canan", 81, true);
		System.out.println("isim: " + insan03.name);
		System.out.println("yas: " + insan03.yas);
		System.out.println("emekli: " + insan03.emekli);
		
		
		
	}

	Constructor03() {

	}

	Constructor03(String name, int yas, boolean emekli) {
		this.name = name;
		this.yas = yas;
		this.emekli =emekli;
		
	}

	Constructor03(int yas) {
		this.yas=yas;

	}
}
