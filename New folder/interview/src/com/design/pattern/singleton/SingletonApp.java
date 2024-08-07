package com.design.pattern.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//singleton may break by cloneable serializable and reflection api to prevent this we will implement clonalbal
//serializable and refltion api.
public class SingletonApp implements Cloneable,Serializable {
	
	private static final long serialVersionUID = -2049613887089091519L;
	private static SingletonApp instance;
	
	private SingletonApp() {
		if(instance != null) {
			throw new IllegalStateException("Illegal state exception");
		}
	}
	
	public static SingletonApp getInstace() {
		if(instance == null) {
			
			synchronized(SingletonApp.class){
				
				if(instance == null) {
					instance=new SingletonApp();
				}
			}
		}
		
		return instance;
	}
	//while trying to clone so will give clone not supported exception
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not surrported exception");
	}
	
	//it will give same instance.
	protected Object readResolve(){
		return getInstace();
	}
	
	public void test() {
		System.out.println("testing singtlon");
	}
	
	public static void main(String[] args) {
		SingletonApp singletonApp = new SingletonApp();
		
		try {
			Constructor<SingletonApp> declaredConstructor = SingletonApp.class.getDeclaredConstructor();
		         declaredConstructor.setAccessible(true);
			SingletonApp reflection=declaredConstructor.newInstance();
                         
			System.out.println(singletonApp==reflection);
			reflection.test();
		}catch (NoSuchMethodException | InstantiationException | IllegalAccessException |InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
	}
	}
}
