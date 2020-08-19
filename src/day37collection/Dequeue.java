package day37collection;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque: Double Ended Queue (Iki uclu Queue)
		// ==> Queue'larda ekleme sona yapilir, silme bastan yapilir
		// Deque kullanirsaniz eklemeyi hem basa hem de sona yapabilirsiniz,
		// ayni sekilde silmeyi de hem bastan hem de sondan yapabilirsiniz.
		// Deque'da FIFO var bunu yaninda LIFO(Last In First Out) da var.
		// Deque resizable'dir. Yani; kapasitesi degistirilebilir

		// Queue'lara eleman olarak null eklenebilir ama Deque'lara null eleman
		// olarak eklenemez.
		
		Deque <String> dq = new LinkedList<>();
		
		dq.add("Ali");
		dq.addFirst("Veli"); // en basa aldi.
		System.out.println(dq);
		dq.addLast("Vali"); // en sona aldi
		System.out.println(dq);
		System.out.println(dq.element());// ilk elemani yazdirir
		System.out.println(dq.getFirst()); // ilk elemani yazdirir.
		System.out.println(dq.getLast()); // Son elemani yazdirir
		dq.offer("Can");
		System.out.println(dq);// en sona ekledi.
		dq.offerFirst("Canan"); // en basa ekledi
		System.out.println(dq);
		dq.offerLast("Cemil"); // en sona ekledi
		System.out.println(dq);
		System.out.println(dq.peek()); // ilk elemani verdi
		System.out.println(dq);
		System.out.println(dq.poll()); // ilk elemani verdi
		System.out.println(dq);
		// peek ile poll medhodlarinin farki peek silmez ama pool siler.
		dq.pop(); // ilk elemani sildi
		System.out.println(dq);
		dq.push("Ahmet");
		System.out.println(dq); // en bastan onceye Ahmet ekledi.
	}

}
