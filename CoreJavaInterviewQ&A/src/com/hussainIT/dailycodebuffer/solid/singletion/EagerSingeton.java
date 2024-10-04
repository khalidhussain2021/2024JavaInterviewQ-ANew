package com.hussainIT.dailycodebuffer.solid.singletion;

import java.io.Serializable;

public class EagerSingeton implements Serializable{ 
	
	private static final EagerSingeton instance=new EagerSingeton();
	
	private EagerSingeton() {
		
	}
	public static EagerSingeton getInstance() {
		return instance;
	}

}
