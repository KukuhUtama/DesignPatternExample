package org.personal.design.facadepattern;

public class FacadeClient {
       public static void main(String[] args){
    	   FacadeHelper facadeHelper = new FacadeHelper();
    	   
    	   System.out.println(facadeHelper.HappyButtonPress());
    	   System.out.println(facadeHelper.HappyButtonRelease());
    	   System.out.println(facadeHelper.NormalButtonPress());
    	   System.out.println(facadeHelper.NormalButtonRelease());
    	   System.out.println(facadeHelper.PanicButtonPress());
    	   System.out.println(facadeHelper.PanicButtonRelease());
       }
}
