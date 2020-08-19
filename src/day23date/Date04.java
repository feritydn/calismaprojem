package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		
		// Date formatini degistirmek
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy"); // 28/MAY/2020
		System.out.println(dtf.format(date));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy/MM/dd");
		System.out.println(dtf1.format(date));
		DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("dd.M.yyyy");
		System.out.println(dtf2.format(date)); // calisir ama biz cift M koyalim.
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh.mm.ss");
		System.out.println(dtf3.format(time));
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH.mm.ss"); // 24 saatlik dilim 
		System.out.println(dtf4.format(time));
		
		// Baska ulkenin Local zamanin almak.
		System.out.println(LocalTime.now(ZoneId.of("America/New_York")));
	}

}
