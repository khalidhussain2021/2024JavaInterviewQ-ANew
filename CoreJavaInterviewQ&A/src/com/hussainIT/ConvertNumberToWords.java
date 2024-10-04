package com.hussainIT;

public class ConvertNumberToWords {
	
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
            "eighteen", "nineteen"
        };
   private static final String[] tens= {
		   "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"  
   };
   
   public static String convertToWords(int num) {
       if (num == 0) {
           return "zero";
       }
       return convert(num).trim();
   }
   
   private static String convert(int num) {
       if (num < 20) {
           return units[num];
       } else if (num < 100) {
           return tens[num / 10] + (num % 10 != 0 ? " " + units[num % 10] : "");
       } else if (num < 1000) {
           return units[num / 100] + " hundred" + (num % 100 != 0 ? " and " + convert(num % 100) : "");
       } else if (num < 100000) {
           return convert(num / 1000) + " thousand" + (num % 1000 != 0 ? " " + convert(num % 1000) : "");
       } else if (num < 1000000) {  // Handling up to lakh (1 million or 10 lakh)
           return convert(num / 100000) + " lakh" + (num % 100000 != 0 ? " " + convert(num % 100000) : "");
       } else {
           return "";
       }
   }
   
   public static void main(String[] args) {
	int number=555;
	String convertToWords = convertToWords(number);
	System.out.println(convertToWords);
}
   
}
