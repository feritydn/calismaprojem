package day17consructors;

public class OdevSorusu02 {
	static int count =0;
	public void increment() {
		count++;
	}
	public static void main(String[] args) {
		OdevSorusu02 obj1 = new OdevSorusu02();
		OdevSorusu02 obj2 = new OdevSorusu02();
		obj1.increment();
		obj2.increment();
		//System.out.println("obj1: count is="+obj1.count);
		//System.out.println("obj2: count is="+obj2.count);
		// Coment sari uyarilar icin
	}

}
