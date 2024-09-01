package com.hussainIT;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FindTheFridayInputYear {

	public static void main(String[] args) {
		String s="md khalid hussain";
		int lastIndex = s.lastIndexOf(' ');
		String lastName = s.substring(lastIndex+1);
		System.out.println(lastName);
		
		int year = 2024; // Input year

        // List to hold all Fridays in the year
        List<LocalDate> fridays = new ArrayList<>();

        // Loop through all the months and days in the year
        for (Month month : Month.values()) {
            LocalDate date = LocalDate.of(year, month, 1);

            // Loop through all days of the month
            while (date.getMonth() == month) {
                if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    fridays.add(date);
                }
                date = date.plusDays(1);
            }
        }

        // Print out all Fridays
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (LocalDate friday : fridays) {
            System.out.println(friday.format(formatter));
        }
		
	}
}
