package org.personal.design.facadepattern;

public class NormalButton implements Button {

	public String press() {
		return "Normal button is being press";
	}

	public String release() {
		return "Normal button is released";
	}

}
