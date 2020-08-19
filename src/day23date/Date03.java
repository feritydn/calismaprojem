package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {

		// Time Manipulation
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println(time.plusNanos(20));
		System.out.println(time.plusSeconds(20));
		System.out.println(time.plusMinutes(20));
		System.out.println(time.plusHours(20));
		
		System.out.println(time.minusNanos(20));
		System.out.println(time.minusSeconds(20));
		System.out.println(time.minusMinutes(20));
		System.out.println(time.minusHours(20));
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);

	}

}
