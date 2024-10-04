package com.hussainIT.dailycodebuffer.solid.factory;

public abstract class OperatingSystem {
	
	private String version;
	private String  architecture;
	
	public OperatingSystem(String version, String architecture) {
		this.version = version;
		this.architecture = architecture;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getArchitecture() {
		return architecture;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public void start() {
		System.out.println("Start the peration system");
	}
	public void stop() {
		System.out.println("stop the operation system");
	}
	protected void task() {
		System.err.println("Task is staring using operation system");
	}
	
	public abstract void changeDir(String dir) throws IllegalAccessException;
	public abstract void removeDir(String dir);
}
