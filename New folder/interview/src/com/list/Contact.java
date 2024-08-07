package com.list;

public class Contact {
	
	private Long mobile;

	public Contact(Long mobile) {
		super();
		this.mobile = mobile;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Contact [mobile=" + mobile + "]";
	}
	
}
