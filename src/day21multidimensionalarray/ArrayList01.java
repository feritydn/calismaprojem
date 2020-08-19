package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Arrays larda lenght sabittir ve degistirilemez. Ama listlerde lenght esnektir. Siz eleman ekledikce lenght 
		// buyur ve siz eleman sildkcede lenght kuculur.
		
		// List olustururken bas tarafa List ya da ArrayList yazabilirsiniz ama esitligin sag tarafina new keywordunden sonra mutlaka
		// ArrayList<>() yazilmalidir
		
		// Sol tarafta List ya da ArrayListten sonra <data type>  yazilir. Bu sag tarafa da yazilir ama data type yazip yazmamak serbesttir.
		
		// <> isaretinden sonra listin ismi yazilir.
		
		List <String> list01 = new ArrayList<>(); 	// Bir List bu sekilde olusturulur. ==> []
													// Listi olusturduktan sonra hem List hem de ArrayList java utilden inport edilmelidir.
		
		// bir listte eleman eklamak icin add() methodu kullanilr.
		list01.add("Suzan");
		list01.add(1,"Meva"); // ==> indexi 1 olan kelimenin meva olmasini istiyorum.
		list01.add("Aydin");
		System.out.println(list01);
		
		List <String> list02 = new ArrayList<>();
		list02.add("Ferit");
		list02.add("Zeynep");
		list02.addAll(1,list01); // ==> indexi 1 olan kelimenin meva olmasini istiyorum.
		System.out.println(list02);
		
	}

}
