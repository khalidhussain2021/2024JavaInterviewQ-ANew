package com.hussainIT.java8.funcationalInterface;
interface Shape {
	void draw();
}


class Circle implements Shape {
	@Override
	public void draw() {
		int r=9;
		System.out.println(" cilcle is "+r*r);
		
	}
}
public class LamdaExpressExp {
	public static void main(String[] args) {
		Shape ractange =()-> {
			int r=4;
			System.out.println("Ractange of the :  "+4*r);
		};
//		ractange.draw();
		
		Shape squre=()-> {
			double r=3.23;
			System.out.println("Square the value "+r*r);
		};
//		squre.draw();
		
		Shape circle=()-> {
			float r=4.9090f;
			System.out.println("circle value : "+4*r*r);
		};
//		circle.draw();
		print(ractange);
		print(circle);
		print(squre);
		
	}
	private static void print(Shape shape) {
		shape.draw();
	}
}
