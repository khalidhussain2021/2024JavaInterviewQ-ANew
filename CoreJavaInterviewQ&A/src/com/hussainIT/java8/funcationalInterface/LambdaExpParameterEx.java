package com.hussainIT.java8.funcationalInterface;

interface Addable {
	int addiation(int a,int b);
}
class AddableImple implements Addable {
	@Override
	public int addiation(int a, int b) {
		return (a+b);
	}
}

public class LambdaExpParameterEx {

	public static void main(String[] args) {
		Addable addableImpl=(a,b) -> {
			return a+b;
		};
		addableImpl.addiation(12, 90);
	}

}
