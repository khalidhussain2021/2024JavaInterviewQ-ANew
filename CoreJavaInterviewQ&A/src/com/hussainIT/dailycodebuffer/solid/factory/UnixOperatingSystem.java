package com.hussainIT.dailycodebuffer.solid.factory;

public class UnixOperatingSystem extends OperatingSystem{

	public UnixOperatingSystem(String version, String architecture) {
		super(version, architecture);
		
	}

	@Override
	public void changeDir(String dir) throws IllegalAccessException {
		if(dir!=null) {
			int length = dir.length();
			System.err.println(length);
		} else {
			throw new NullPointerException("empty string");
		}
	}

	@Override
	public void removeDir(String dir) {
		System.err.println(dir.getBytes());
		
	}

}
