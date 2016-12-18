package org.personal.design.factorypattern;

public class SocialMediaFactory {

	private static SocialMedia socialMedia;

	public static SocialMedia getSocialMedia(SocialMediaType type) {

		switch (type) {
		case PATH:
			   socialMedia = new Path();
			break;
		case TWITTER:
			   socialMedia = new Twitter();
			break;
		case FACEBOOK:
			   socialMedia = new Facebook();
			break;
		default:
			break;
		}

		return socialMedia;
	}
}
