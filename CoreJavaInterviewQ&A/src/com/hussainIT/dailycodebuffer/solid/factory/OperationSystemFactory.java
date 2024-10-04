package com.hussainIT.dailycodebuffer.solid.factory;

public class OperationSystemFactory {
	
	private OperationSystemFactory() {
		
	}
	public static OperatingSystem getInOperatingSystem(String type,String version,String architecture) {
		switch(type) {
		case  "WINDOWS":
			return new WindowOperatingSys(version, architecture);
		case "LINUX" :
			return new LinuxOperationSys(version, architecture);
		case "Unix" :
		   return new UnixOperatingSystem(version, architecture);
		 default :
			 throw new IllegalArgumentException("OS Not supported");
		}
		
		
	}
	public static void main(String[] args) {
		
	}
}
