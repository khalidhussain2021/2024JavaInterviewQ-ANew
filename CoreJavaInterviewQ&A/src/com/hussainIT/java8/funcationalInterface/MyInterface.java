package com.hussainIT.java8.funcationalInterface;

import java.io.PrintWriter;

@FunctionalInterface
public interface MyInterface {
   public void execute();
   
   public default void print(String text) {
	  System.out.println(text); 
   }
   
   public static void print(String text,PrintWriter writer) {
	   writer.write(text);
   }
   
}
