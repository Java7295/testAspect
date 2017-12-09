package com.testAspect;

public class testAspect {

    public static void main (String args[])
    {
    	testAspect testaspect = new testAspect();

    	float screenheight = 50;
    	float screenwidth = 100;

    	float imgheight = 40;
    	float imgwidth = 85;

    	int scaled_imgheight = Math.round(screenheight / imgheight * imgheight);
    	int scaled_imgwidth = Math.round(screenwidth / imgwidth * imgwidth);

    	if (screenheight / imgheight > screenwidth / imgwidth)
    		scaled_imgheight = Math.round(screenwidth / imgwidth * imgheight);
    	else
    		scaled_imgwidth = Math.round(screenheight / imgheight * imgwidth);

    	System.out.println("Screen size : " + screenheight + " x " + screenwidth);
    	System.out.println("Image size : " + imgheight + " x " + imgwidth);
    	System.out.println("Scaled Image size : " + scaled_imgheight + " x " + scaled_imgwidth);    	
    }
}
