package day26encapsulation;

public class Inheritance01 {

	public static void main(String[] args) {
		/*Inheritance Turkcede miras demektir. Iki class arasinda parent child iliskisi varsa inheritance dan soz edilebilir.
		 * 
		 * Inheritance in kurallari;
		 *                          1. Inheritance public ve protected datalar icin problemsiz calisir.
		 *                          2. Inheritance default datalar icin parent ile child ayni package icinde ise calisir.
		 *                          3. Inheritance privete classlar icin asla calismaz.
		 *                          
		 * Parent child iliskisi kurmak icin iki class arasinda soyle bir iliski kurulur
		 *                   ChildClass extends ParentClass
		 */
		
		Encapsulation02 obj1 = new Encapsulation02();
		obj1.setPara(300);
		

	}

}
