package com.array;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FindTheSecondFridayofnextMonth {
	public static void main(String[] args) {
		// Get today's date
        LocalDate today = LocalDate.now();
        
        // Move to the first day of the next month
        LocalDate firstDayOfNextMonth = today.plusMonths(1).withDayOfMonth(1);
        
        // Find the first Friday of the next month
        LocalDate firstFridayOfNextMonth = firstDayOfNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        
        // Calculate the second Friday by adding 7 days to the first Friday
        LocalDate secondFridayOfNextMonth = firstFridayOfNextMonth.plusWeeks(1);
        
        // Print the date of the second Friday of the next month
        System.out.println("The second Friday of the next month is: " + secondFridayOfNextMonth);
		
	}
}
