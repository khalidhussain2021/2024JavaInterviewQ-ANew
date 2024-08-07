package com.design.pattern.factory;

public class FactoryClientCode {
	public static void main(String[] args) {
		FactoryProduct fpa= new FactoryProductImplA();
		Product pa = fpa.factoryCreated();
		pa.create();
		
		
		FactoryProduct fpb =new FactoryProductImplB();
		Product pb = fpb.factoryCreated();
		pb.create();
	}
	
	

}
