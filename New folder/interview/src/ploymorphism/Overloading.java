package ploymorphism;

public class Overloading {
	public static void main(String[] args) {
		 Overloading o = new Overloading();
		 
		 System.out.println(o.add(10, 20));
		 System.out.println(o.add(10, 20, 10.5));
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(int c, int d, double e) {
		return c+d+e;
	}

}
