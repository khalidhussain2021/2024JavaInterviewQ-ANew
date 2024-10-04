package com.hussainIT;

public class SumOfDigitsInString {
		

	public static void main(String[] args) {
			
		String str = "aabb34kkjj12";
        int sum = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to its numeric value and add to the sum
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("The sum of digits in the string is: " + sum);
    }
}


