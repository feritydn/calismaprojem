package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals methodu iki listin esit olup olmadigini kontrol eder.
		// esit ise true yanlis ise false return eder.
		
		// equals methodu ayni indexte ayni elemanin olup olmadigini kontrol eder.
		
		List <String> list1 = new ArrayList<>();
		List <String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));
		 list1.add("");
		 System.out.println(list1.equals(list2));
		
	}

}
