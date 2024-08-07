package com.hussainIT;

//Write program to find frequency of a Substring (pattern) in a input String.
//1. Input string = “aabccaadcbaabc”,
//Pattern = “aa”
//Output: 3

public class FrequencyOfSubString {

	public static void main(String[] args) {
		String inputString = "aabccaadcbaabc";
		String pattern = "aa";

		int frequency = findSubstringFrequency(inputString, pattern);

		System.out.println(
				"Frequency of pattern \"" + pattern + "\" in input string \"" + inputString + "\" is: " + frequency);
	}

	public static int findSubstringFrequency(String input, String pattern) {
		if (input == null || pattern == null || pattern.length() == 0 || input.length() < pattern.length()) {
			return 0;
		}

		int count = 0;
		int index = 0;

		while ((index = input.indexOf(pattern, index)) != -1) {
			count++;
			index += pattern.length();
		}

		return count;
	}
}
