package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class Arrays02 {

	public static void main(String[] args) {
		// Listler data type olarak primitive data type kabul etmezler
		// bunu icin data type olarka wrapper classlari kullaniriz.
		List <Integer> list1 = new ArrayList<>(); 
		
		// bir listin icinde eleman olup olmadigini isEmpty() methodu ile kontrol ederiz
		System.out.println(list1.isEmpty()); // true bekliyoruz
		list1.add(10);
		System.out.println(list1.isEmpty()); // false
		
		// bir listten eleman silmek icin remove() methodu kullaniyoruz.
		list1.add(15);
		list1.add(20);
		list1.add(25);
		list1.add(30);
		list1.remove(3); // indexi 3 olan elemani siler yani 25
		System.out.println(list1);
		
		// bir lsitin uzunlugunu size() ile buluruz.
		System.out.println(list1.size());
		list1.remove(list1.size()-2); // 20 silinir
		System.out.println(list1);
	}

}
