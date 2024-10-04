package com.interview.prog;

public class TransientAndVolatile {
	
	//Transient ---
	/*transient keyword is used to indicate that a variable should not be serialized when the object containing it is serialized. 
	
	*/
	//Volatile -- 
	/*If Any Thread try  to Modify The Value of Volatile Variable Immediately it will be Visible for
	 *  next thread.
       Java, the volatile keyword is used to indicate that a variable's value may be modified by 
       different threads. It ensures that changes made by one thread to the variable are immediately 
       visible to other threads. The volatile keyword addresses visibility issues in multithreaded
        environments but does not guarantee atomicity 
       (i.e., operations like incrementing a variable are not atomic even if the variable is volatile).
   */
}
