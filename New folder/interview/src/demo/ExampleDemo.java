package demo;

class OuterClass {
	
	 private static String code="COPE";
	 
	 private String codes="CO";
	 
	 //only static memeber of outer class can access directly in neasted class
	public static class NeastedStatic{
		
		public void instanceMethod() {
			
			System.out.println(code);
//			System.out.println(codes);
		}
		
	}

// non static class called as inner class
//both static and non static members of outer class can be accessble in inner class
public class InnerClass{
	
	public void display() {
		System.out.println(codes);
		System.out.println(code);
	}
}
}

public class ExampleDemo{
	public static void main(String[] args) {

		 OuterClass.NeastedStatic on= new OuterClass.NeastedStatic();
		 on.instanceMethod();
		 
		 OuterClass.InnerClass oi=     new OuterClass().new InnerClass();
		 oi.display();
	}
}

