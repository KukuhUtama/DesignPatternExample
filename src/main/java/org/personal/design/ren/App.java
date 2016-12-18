package org.personal.design.ren;

import org.personal.design.factorypattern.SocialMediaFactory;
import org.personal.design.factorypattern.SocialMediaType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(SocialMediaFactory.getSocialMedia(SocialMediaType.FACEBOOK));
        System.out.println(SocialMediaFactory.getSocialMedia(SocialMediaType.PATH));
        System.out.println(SocialMediaFactory.getSocialMedia(SocialMediaType.TWITTER));
    }
}
