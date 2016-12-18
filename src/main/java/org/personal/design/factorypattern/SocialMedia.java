package org.personal.design.factorypattern;

public abstract class SocialMedia {

	public SocialMedia(SocialMediaType type) {
		this.type = type;
	}

	private SocialMediaType type;

	public SocialMediaType getType() {
		return type;
	}

	public void setType(SocialMediaType type) {
		this.type = type;
	}

	protected abstract void uniqueness();
}
