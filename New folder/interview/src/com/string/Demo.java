package com.string;

public class Demo {
public static void main(String[] args) {
	String s1 = new String("syz");
	String s2="syz";
	String s3=s1;
	String s4="HelloWord";
	String s5="Hello"+"Word";
	System.err.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.err.println(s3==s1);
	System.err.println(s4==s5);
  }
}
