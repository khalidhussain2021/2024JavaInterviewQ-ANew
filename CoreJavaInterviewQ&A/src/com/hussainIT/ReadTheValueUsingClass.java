package com.hussainIT;

import java.io.InputStream;
import java.util.Properties;

public class ReadTheValueUsingClass {

	public static void main(String[] args) {
		Properties properties=new Properties();
		try(InputStream input= ReadTheValueUsingClass.class.getClassLoader().getResourceAsStream("config.properties")) {
		if(input==null) {
			System.out.println("Sorry, unable to load the config.proprties file ");
			return;
		}
		properties.load(input);
		String nameValue = properties.getProperty("name");
		String ageValue = properties.getProperty("age");
		String salaryValue = properties.getProperty("salary");
		System.out.println("name "+nameValue +" age "+ageValue+" salary "+salaryValue);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
