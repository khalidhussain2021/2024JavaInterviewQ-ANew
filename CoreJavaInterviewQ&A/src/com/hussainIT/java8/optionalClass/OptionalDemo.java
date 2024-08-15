package com.hussainIT.java8.optionalClass;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
	 //of , empty, ofNullable mehtod using the class Optional class that is using Optional Utily class 
//	Optional<Object> empty = Optional.empty();
//	System.out.println(empty);
	

	String email=null;
//	String email="khalid@gmail.com";
//	Optional<String> emailOptional = Optional.of(email);
//	System.err.println(emailOptional);
	
  //isPresent .orElse method 
	
	Optional<String> emailofNullable = Optional.ofNullable(email);
	if(emailofNullable.isPresent()) {
		System.out.println(emailofNullable.get());
	}else {
		System.err.println("value is not present");
	}
	
	Optional<String> emailofNullable1 = Optional.ofNullable(email);
	String orElse = emailofNullable1.orElse("defualt@gmail.com");
	System.out.println(orElse);
	
	String orElseGet = emailofNullable1.orElseGet(()->"value is not present");
	System.out.println("OptionalDemo.main() " + orElseGet);
	
//	String orElseThrow = emailofNullable.orElseThrow(()->new IllegalArgumentException("value is not exit"));
//	System.out.println(orElseThrow);
	
	Optional<String>  gender = Optional.of("MALE");
	Optional<Object> emptyOp = Optional.empty();
	gender.ifPresent((s)->System.out.println("value "+s));
	emptyOp.ifPresent((s)->System.out.println("value is not present"));
	
	String result="abcd";
	if(result !=null && result.contains("abcd")) {
		System.out.println(result);
	}
	Optional<String> optionalStr = Optional.of(result);
	optionalStr.filter(res->res.contains(result))
	.map(String::trim).map(String::toUpperCase)
	.ifPresent((r)->System.out.println(r));
	
  }
}
