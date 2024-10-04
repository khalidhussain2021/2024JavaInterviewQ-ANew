package com.hussainIT.dailycodebuffer.solid.factory;

public class LinuxOperationSys extends OperatingSystem{

	public LinuxOperationSys(String version, String architecture) {
		super(version, architecture);
		
	}

	@Override
	public void changeDir(String dir) throws IllegalAccessException {
		String rev="";
		if(dir!=null) {
			for(int i=dir.length()-1;i>=0;i++) {
				rev+=dir.charAt(i);
			}
			System.err.println(rev);
		}else {
			throw new IllegalAccessException("Empy of the string");
		}
		
	}

	@Override
	public void removeDir(String dir) {
		// TODO Auto-generated method stub
		
	}

}
