package com.order.com.order.model;

public class Order {

	private Long id;
	
	private String OrderName;
	
	private Double OrderPrice;
	
	public Order(Long id, String orderName, Double orderPrice) {
		super();
		this.id = id;
		OrderName = orderName;
		OrderPrice = orderPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderName() {
		return OrderName;
	}

	public void setOrderName(String orderName) {
		OrderName = orderName;
	}

	public Double getOrderPrice() {
		return OrderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		OrderPrice = orderPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", OrderName=" + OrderName + ", OrderPrice=" + OrderPrice + "]";
	}
	
}
