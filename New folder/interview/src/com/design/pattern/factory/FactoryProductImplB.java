package com.design.pattern.factory;

public class FactoryProductImplB implements FactoryProduct {

	@Override
	public Product factoryCreated() {
		
		return new ProductImplB();
	}

}
