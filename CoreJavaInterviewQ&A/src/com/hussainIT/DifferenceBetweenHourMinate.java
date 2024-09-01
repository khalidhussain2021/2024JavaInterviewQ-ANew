package com.hussainIT;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DifferenceBetweenHourMinate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date : dd/mm/yyyy");
		String inputDate=sc.nextLine();
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
		LocalDate date=LocalDate.parse(inputDate, dateTimeFormatter);
		String dayofWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		DateTimeFormatter outPutFormater = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String result = date.format(outPutFormater);
		System.out.println(dayofWeek +" "+result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
