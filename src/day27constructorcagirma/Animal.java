package day27constructorcagirma;

public class Animal {
	public int age;
	protected String name;
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		System.out.println(animal.age);
		
	}

	public void move() {
		System.out.println("Hayvanlar hareket eder.");
	}
	
	public void eat() {
		System.out.println("hayvanlar yemek yer");
	}
	
	Animal(){
		System.out.println("Animal parametresiz constructor");
	}
}
