package com.interview.prog;

//shollow copy-changes in one entity is reflected in other entity cause no new memroy is allocated.
//creating a copy of an object where only the top-level structure of the object is duplicated, but the nested objects (if any) are shared between the original and the cloned object. This means that changes to the nested objects in the original or the clone will affect both, as
//they still reference the same memory locations for those nested objects.
//deep copy- 
//changes is not reflected in other entity cause new memory is allocated.
//
 class Shallowcloning {
	
	public int x=30;
 }
public class mainForShallowAndDeep{
	
	public static void main(String[] args) {
		
	Shallowcloning sc= new Shallowcloning();
		
		Shallowcloning sc2=sc;
		sc.x=6;
		System.out.println("Shallow Cloning:"+sc.x);
		//no New Memory Will be Allocated in same reference pointing
	}
}
	
	//deep cloneing
	
	/*Shallowcloning sc1= new Shallowcloning();
	
	Shallowcloning sc2= new Shallowcloning();
	sc2.x=6;
	System.out.println("Deep Cloning:"+sc2.x);//output=30
	//new memory will allocated for modify variable

}*/