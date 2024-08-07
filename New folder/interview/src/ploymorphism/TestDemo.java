package ploymorphism;

public class TestDemo {
	public static void main(String[] args) {
		DemoInterface dif= (x)->{System.out.println(x*2);};
		dif.test(20);
	}

}
