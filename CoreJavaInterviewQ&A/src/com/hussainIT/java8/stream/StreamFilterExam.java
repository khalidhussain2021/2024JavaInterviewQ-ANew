package com.hussainIT.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private Integer pId;
	private String pName;
	private Float price;
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Float getPrice() {
		return price;
	}
    
	public Product(Integer pId, String pName, Float price) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
		@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}	
}
public class StreamFilterExam {
	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		for(Product p:getProduct()) {
			if(p.getPrice() > 25000) {
				list.add(p);
			}
		}
//		System.err.println(list);
		//using java 8 
		List<Product> list2 = getProduct().stream().filter(product->product.getPrice()>10000).collect(Collectors.toList());
//		System.out.println(list2);
		getProduct().stream().filter(p->p.getpName().length()> 4).forEach(System.out::println);
	}
	public static List<Product> getProduct() {
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1,"Dell",10000.89f));
		productList.add(new Product(2,"HP",9000.44f));
		productList.add(new Product(3,"Lenevo ",3000.f));
		productList.add(new Product(10,"Lenevo", 32000.99f));
		productList.add(new Product(13,"Apple ", 10000f));
		return productList;
	}
}
