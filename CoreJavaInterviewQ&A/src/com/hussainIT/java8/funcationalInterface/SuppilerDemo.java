package com.hussainIT.java8.funcationalInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<String>  {
	@Override
	public String get() {
		return "Khalid Hussain";
	}
}
public class SuppilerDemo {
	public static void main(String[] args) {
		SupplierImpl sup=new SupplierImpl();
		System.out.println(sup.get());
		
		Supplier<LocalDate> fu=()->{
			return LocalDate.now();
		};
		System.out.println(fu.get());
	}
}
