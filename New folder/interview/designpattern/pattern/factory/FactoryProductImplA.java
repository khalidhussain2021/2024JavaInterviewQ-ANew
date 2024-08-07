package com.design.pattern.factory;

public class FactoryProductImplA implements FactoryProduct{

	@Override
	public Product factoryCreated() {
		return new ProductImplA();
	}

}
