package com.hussainIT;

public class CommandLineRead {

	public static void main(String[] args) {
		if(args==null) {
			System.out.println("No argument is pass ");
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("Argument " +(i+1) + " : "+args[i]);
		}
		//second way
		String name=args[0];
		String age=args[1];
		System.out.println("Name is "+name +" age is  "+age);
	}

}
