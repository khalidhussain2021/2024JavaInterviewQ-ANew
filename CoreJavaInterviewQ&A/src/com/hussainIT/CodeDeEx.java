package com.hussainIT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeDeEx {
//	 In the Java file, write a program to perform a GET request on the route https://coderbyte.com/api/challenges/json/age-counting which contains a data key and the value is a string which contains items in the format: key=STRING, age=INTEGER. Your goal is to count how many items exist that have an age equal to or greater than 50, and print this final value.
//
//		 Example Input
//		 {"data":"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=47"}
	public static void main(String[] args) {
		 try {
	            // Define the URL
	            String urlString = "https://coderbyte.com/api/challenges/json/age-counting";
	            URL url = new URL(urlString);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            // Read the response from the API
	            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            String inputLine;
	            StringBuilder content = new StringBuilder();
	            while ((inputLine = in.readLine()) != null) {
	                content.append(inputLine);
	            }

	            // Close the connections
	            in.close();
	            connection.disconnect();

	            // Extract the data string
	            String jsonResponse = content.toString();
	            String dataString = jsonResponse.split("\"data\":\"")[1].replace("\"}", ""); // Extract the "data" string

	            // Use regex to find all age values
	            Pattern pattern = Pattern.compile("age=(\\d+)");
	            Matcher matcher = pattern.matcher(dataString);
	            
	            int count = 0;
	            int varOcg; // __define-ocg__: Variable to be used in counting ages
	            while (matcher.find()) {
	                varOcg = Integer.parseInt(matcher.group(1)); // Extract the age
	                if (varOcg >= 50) {
	                    count++; // Increment if age is 50 or more
	                }
	            }

	            // Print the final count of ages >= 50
	            System.out.println("Number of ages >= 50: " + count);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
