package com.interview.prog;

//shollow copy-changes in one entity is reflected in other entity cause no new memroy is allocated.
//deep copy- changes is not reflected in other entity cause new memroty is allocated.
 class Shallowcloning {
	
	public int x=30;
	}
//public class mainForShallowAndDeep{
	
	/*public static void main(String[] args) {
		
	/*	Shallowcloning sc= new Shallowcloning();
		
		Shallowcloning sc2=sc;
		sc.x=6;
		System.out.println("Shallow Cloning:"+sc.x);//no New Memory Will be Allocated in same reference pointing
		output=6
	}*/
	
	//deep cloneing
	
	/*Shallowcloning sc1= new Shallowcloning();
	
	Shallowcloning sc2= new Shallowcloning();
	sc2.x=6;
	System.out.println("Deep Cloning:"+sc2.x);//output=30
	//new memory will allocated for modify variable

}*/