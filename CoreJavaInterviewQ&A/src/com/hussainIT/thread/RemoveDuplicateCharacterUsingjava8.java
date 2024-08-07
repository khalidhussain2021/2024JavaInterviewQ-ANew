package com.hussainIT.thread;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterUsingjava8 {
    public static void main(String[] args) {
    	 A a = new B();
         System.out.println(a.i);
         String str="GoodMorning";

         Set<Character> set=new HashSet<>();

         String collect = str.toLowerCase().chars()  // Convert to lowercase for case-insensitive processing
         .mapToObj(c -> (char) c)
         .filter(set::add)
         .map(String::valueOf)
         .collect(Collectors.joining());
         System.out.println(collect);
         
         String output
         = str.toLowerCase().chars() .mapToObj(c->(char)c).filter(f->set.add(f)).map(String::valueOf).collect(Collectors.joining());
         System.out.println(output);

   
         

	}
}
class A
{
    int i = 10;
}
class B extends A
{
    int i = 20;
}


   
