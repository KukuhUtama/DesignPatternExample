package org.personal.design.observerpattern;

public class Supplier implements Observer {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void update() {
		System.out.println("Supplier " + name + " Address " + address + " get notifcation");
	}
}
