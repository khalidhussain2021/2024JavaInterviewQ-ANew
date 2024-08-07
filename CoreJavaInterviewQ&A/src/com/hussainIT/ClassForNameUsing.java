package com.hussainIT;

import java.lang.reflect.Constructor;
import java.util.Objects;

class MyClass {
	private String name;
	public MyClass() {
		this.name="default Name";
	}
	public MyClass(String name) {
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		return Objects.equals(name, other.name);
	}
	public String getName() {
		return name;
	}
  }
public class ClassForNameUsing {
	public static void main(String[] args) {
		try {
			String className= "com.hussainIT.MyClass";
			Class<?> cls = Class.forName(className);
			Object obj1 = cls.getDeclaredConstructor().newInstance();
			Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
			Object obj2 = constructor.newInstance("Default Name");
			  if (obj1 == obj2) {
	                System.out.println("Both objects are the same (==)");
	            } else {
	                System.out.println("Both objects are not the same (==)");
	            }

	            // Check if the two objects are equal (content comparison)
	            if (obj1.equals(obj2)) {
	                System.out.println("Both objects are equal (equals)");
	            } else {
	                System.out.println("Both objects are not equal (equals)");
	            }

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
