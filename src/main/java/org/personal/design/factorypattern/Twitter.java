package org.personal.design.factorypattern;

public class Twitter extends SocialMedia{

	public Twitter() {
		super(SocialMediaType.TWITTER);
		uniqueness();
	}

	@Override
	protected void uniqueness() {
		 System.out.println("This is uniqueness of Twitter");
	}

}
