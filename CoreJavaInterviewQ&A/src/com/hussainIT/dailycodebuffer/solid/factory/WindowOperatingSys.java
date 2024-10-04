package com.hussainIT.dailycodebuffer.solid.factory;

public class WindowOperatingSys extends OperatingSystem{

	public WindowOperatingSys(String version, String architecture) {
		super(version, architecture);
	}

	@Override
	public void changeDir(String dir) {
		char[] charArray = dir.toCharArray();
		for(char c:charArray) {
			if(c=='a') {
				System.err.println(65);
			}else if(c=='b') {
				System.out.println(66);
			}
		}
	}

	@Override
	public void removeDir(String dir) {
	 if(!dir.isEmpty()) {
		 int compareTo = dir.compareTo("hi");
		 System.err.println(compareTo);
	 }
		
	}

}
