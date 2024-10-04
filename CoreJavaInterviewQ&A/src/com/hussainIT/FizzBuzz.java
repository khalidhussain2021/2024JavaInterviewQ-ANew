package com.hussainIT;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
   public static void main(String[] args) {
	List<String> result= fizzBuzz(15);
	System.out.println(result);
 }
  public static List<String> fizzBuzz(int n) {
	  List<String> answer=new ArrayList<>();
	  for(int i=1;i<=n;i++) {
		  boolean divBy3= i%3==0;
		  boolean devBy5= i%5==0;
		  String currentStr="";
		  if(divBy3) {
			  currentStr+="Fizz";
		  }
		  if(devBy5) {
			  currentStr+="buzz";
		  }
		  if(currentStr.isEmpty()) {
			  currentStr+=String.valueOf(i);
		  }
		  answer.add(currentStr);
	  }
	  return answer;
  }
}
