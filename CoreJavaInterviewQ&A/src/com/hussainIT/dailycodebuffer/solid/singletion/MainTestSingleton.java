package com.hussainIT.dailycodebuffer.solid.singletion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainTestSingleton {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//exampleSerialization();
		reflexionApiExample();
	}
	private static void exampleSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		//for lazy singeton 
		LazySingleton lazySingleton=LazySingleton.getInstance();
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("object.obj"));
		objectOutputStream.writeObject(lazySingleton);
		objectOutputStream.close();
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("object.obj"));
		LazySingleton desLazySingleton=(LazySingleton)objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println("object 1"+lazySingleton.hashCode());
		System.out.println("object 2"+desLazySingleton.hashCode());
		
		//for seriazaile class 
		
		SerializableSingleton serializableSingleton=SerializableSingleton.getInstance();
		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("object1.obj"));
		outputStream.writeObject(serializableSingleton);
		outputStream.close();
		ObjectInputStream objectInputStream2=new ObjectInputStream(new FileInputStream("object1.obj"));
		SerializableSingleton desSerializableSingleton=(SerializableSingleton)objectInputStream2.readObject();
		objectInputStream2.close();
		
		System.err.println("object 1 "+serializableSingleton.hashCode());
		System.err.println("object 2 "+desSerializableSingleton.hashCode());	
	}
	
	private static void reflexionApiExample() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
		Constructor constructor = constructors[0];
		constructor.setAccessible(true);
		LazySingleton lazySingleton=(LazySingleton)constructor.newInstance();
		LazySingleton instance=LazySingleton.getInstance();
		System.out.println("object 1"+lazySingleton.hashCode());
		System.out.println("object 2 "+instance.hashCode());
		
		//solution to this go to enum
		EnumSingelton.INSTANCE.doSomething();
	}
	
}
