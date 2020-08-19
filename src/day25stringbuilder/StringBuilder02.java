package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// StringBuilder ile beraber kullanilan bazi methodlar
		
		// 1. subString () methodu eger herhangi bir atama yapilmadiysa Stringi dergistiremez.
		
		StringBuilder strBld1 = new StringBuilder();
		strBld1.append("Suzan Meva");
		strBld1.substring(6);
		System.out.println(strBld1); // Degisiklik olmadi cunku atama yapilmadi.
		
		//Substring kullanarak degisiklikleri ancak atama ile yapabiliriz
		String str = strBld1.substring(6);
		System.out.println(str);
		
		// 2. indexof() belli bir indexteki elemani return eder.
		
		System.out.println(strBld1.indexOf("M"));
		// Girilen karakterin indexini verdi. eger olmayan bir karakter girmis olsaydi "-1" return ederdi.
		
		// 3. lenght() methodu belirtilen Stringin uzunlugunu verir.
		
		System.out.println(strBld1.length());
		
		// 4. charAt() methodu belli bir indexteki belli karakteri return eder
		
		System.out.println(strBld1.charAt(0)); //S
		
		// Eger olamayan bir index girersek " java.lang.StringIndexOutOfBoundsException" aliriz ve 
		// bu exceptionu da run Time olarak goruruz.
		//System.out.println(strBld1.charAt(11));
		
		// 5. insert () methodu istenen karakteri istenilen karakterle eklemeye yarar.
		//    append gibi Stringi direkt degistirir.
		
		strBld1.insert(0, "X");
		System.out.println(strBld1);
		
		// 6. delete() istenilen indexteki characteri silmeye yarar. Stringi direkt degistirir.
		
		strBld1.delete(0, 1);
		System.out.println(strBld1);
		
		// 7. deleteCharAt () istenen indexteki charalari silmeye yarar. Stringi direkt degistirir.
		
		strBld1.deleteCharAt(5);
		System.out.println(strBld1);
		
		// 8. reverse() methodu girilen stringi tersten yazdirir.
		strBld1.reverse();
		System.out.println(strBld1);
		
		// 9. toString() methodu StringBuilderi Stringe cevirir.
		
		strBld1.toString();
		System.out.println(strBld1);
		
		
	}

}
