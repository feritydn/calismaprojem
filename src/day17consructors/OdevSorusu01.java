package day17consructors;

public class OdevSorusu01 {

	int x =3;
	int y =5;
	OdevSorusu01 (){
		x += 1;
		System.out.println("-x" + x);
	}
	OdevSorusu01(int i){
		this();
		this.y = i;
		x +=y;
		System.out.println("-x" + x);
	}
	OdevSorusu01 (int i, int i2){
		this(3);
		this.x -=4;
		System.out.println("-x" + x);
	}
	public static void main(String[] args) {
		OdevSorusu01 mc1 = new OdevSorusu01(4,3);
		System.out.println(mc1.x); // sari cizgi kalksin diye
	}

}
