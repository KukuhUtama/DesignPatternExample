package org.personal.design.facadepattern;

public class FacadeHelper {

	private Button happyButton;
	private Button panicButton;
	private Button normalButton;

	public FacadeHelper() {
		happyButton = new HappyButton();
		panicButton = new PanicButton();
		normalButton = new NormalButton();
	}

	public String PanicButtonPress() {
		return panicButton.press();
	}

	public String PanicButtonRelease() {
		return panicButton.release();
	}

	public String HappyButtonPress() {
		return happyButton.press();
	}

	public String HappyButtonRelease() {
		return happyButton.release();
	}

	public String NormalButtonPress() {
		return normalButton.press();
	}

	public String NormalButtonRelease() {
		return normalButton.release();
	}
}
