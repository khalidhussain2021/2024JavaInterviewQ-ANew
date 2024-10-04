package com.hussainIT;

public class Teacher {
	public static void observe() {
		System.err.println("Student are good");
	}
	public static void main(String[] args) {
		Teacher teacher=new Student();
		teacher.observe();
	}
}
class Student extends Teacher {
	public static void display() {
		System.err.println("Teacher teacher student");
	}
}