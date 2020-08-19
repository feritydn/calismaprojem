package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Mapp bir Interfacedir. Map Interfacenin 3 tane child classi vardir.
		/* 1) HashMap: Hashmap key - value yapisini kullanir. Key ve value programci 
		 *             tarafindan uretilir.
		 *             key ve value'de null degeri kullanilabilir. Key'de 1'den fazla
		 *             null degeri kullanilirsa java son kullanilan null'i kabul eder.
		 *             Valuede birden fazla null degeri kullanilabilir.
		 *             Not: HashMap console yazdirildiginda hem key degerleri hem de value
		 *             degerleri aralarina = sembolu konularak yazdirir.
		 *             HashMap lar ekrana yazdirirken rastgele siralama yapar
		 *             Siralama yapmadigi icin HashMap maplar arasinda en hizlidir.
		 *             HashMap ler "thread safe" degildir.
		 *             thread safe ==> Ayni anda bir cok yerde calisamaz (reklem gibi)
		 */
		
		HashMap<Integer,String> hMap = new HashMap <>();
		hMap.put(10, "A");
		hMap.put(12, "B");
		hMap.put(01, "C");
		hMap.put(17, "D");
		hMap.put(123, "E");
		System.out.println(hMap);
		System.out.println(hMap.keySet()); // keyleri veriri
		System.out.println(hMap.toString());

	}

}
