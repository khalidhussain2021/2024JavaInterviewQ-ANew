package com.hussainIT.dailycodebuffer.solid.abstractFactory;

public class MacUIFactory implements UIFactory{

	public Button createButton() {
		return new MacButton();
	}

	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}

}
