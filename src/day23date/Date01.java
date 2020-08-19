package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Let's print today's date on the screen
		System.out.println(LocalDate.now());
		
		// Let's print the time of the day in hours, minutes, seconds
		System.out.println(LocalTime.now());
		
		// Let's print the date and time of today
		System.out.println(LocalDateTime.now());
		//2020-05-20T11:02:06.295 "T" here is put to separate the date and time.
	}

}
