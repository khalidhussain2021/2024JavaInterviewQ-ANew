package com.hussainIT.dailycodebuffer.solid.abstractFactory;

public class WindowUIFactory implements UIFactory{

	public Button createButton() {
		
		return new WindowButton();
	}

	public CheckBox createCheckBox() {

		return new WindowCheckBox();
	}

}
