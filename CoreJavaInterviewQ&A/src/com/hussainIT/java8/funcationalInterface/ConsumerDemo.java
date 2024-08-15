package com.hussainIT.java8.funcationalInterface;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
}
public class ConsumerDemo {
	public static void main(String[] args) {
		ConsumerImpl consumerImpl = new ConsumerImpl();
		consumerImpl.accept("Hi Hussain");
		
		Consumer<String> c=(s) -> System.out.println(s); 
		c.accept("Khalid ");
	}
}
