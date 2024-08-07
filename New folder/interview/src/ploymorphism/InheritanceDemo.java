package ploymorphism;

public class InheritanceDemo {
	
	public void m1() {
		System.out.println("m1 parent");
		 m2();
	}

	public void m2() {
		
		System.out.println("m2 parent");
	}
	 
	public static void main(String[] args) {
		InheritanceDemo id = new InheritanceDemo();
		id.m1();
	}

}

class ChildDemo extends InheritanceDemo{
	
@Override	
public void m2() {
		
		System.out.println("m2 child");
	}
}
