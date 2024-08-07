package com.hussainIT;

import java.io.File;

public class CurrentDir {
	public static void main(String[] args) {
		String currentdirecory = System.getProperty("user.dir");
		System.out.println("current directory "+currentdirecory);
		
		
		String directoryPath=".";
		File directory =new File(directoryPath);
		String[] contents = directory.list();
		if(contents !=null) {
			for(String items: contents) {
				System.out.println(items);
			}
		}else {
			System.out.println("direcory is not exist");
		}
		
		
	}

}
