package org.personal.design.observerpattern;

public class Buyer implements Observer {

	private String name;
	private String job;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void update() {
		System.out.println("Name " + name + " Job " + job + " get notifcation");
	}

}
