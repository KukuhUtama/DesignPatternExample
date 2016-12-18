package org.personal.design.factorypattern;

public class Path extends SocialMedia{

	public Path() {
		super(SocialMediaType.PATH);
		uniqueness();
	}

	@Override
	protected void uniqueness() {
		 System.out.println("This is uniqueness of Path");
	}

}
