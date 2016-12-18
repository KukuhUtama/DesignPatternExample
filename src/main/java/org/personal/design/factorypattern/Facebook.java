package org.personal.design.factorypattern;

public class Facebook extends SocialMedia{

	public Facebook() {
		super(SocialMediaType.FACEBOOK);
		uniqueness();
	}

	@Override
	protected void uniqueness() {
	    System.out.println("This is uniqueness of Facebook");
	}

}
