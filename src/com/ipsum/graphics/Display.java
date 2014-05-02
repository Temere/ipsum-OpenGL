package com.ipsum.graphics;


import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.DisplayMode;

public class Display {

    private int width;
    private int height;

    public Display(int width, int height)
    {
        this.width = width;
        this.height = height;

        /* Create Display */
        try
        {
            org.lwjgl.opengl.Display.setDisplayMode(new DisplayMode(width, height));
            org.lwjgl.opengl.Display.create();
            org.lwjgl.opengl.Display.setResizable(true);
        }
        catch (LWJGLException e)
        {
            e.printStackTrace();
        }
    }
    public boolean isCloseRequested()
    {
        return org.lwjgl.opengl.Display.isCloseRequested();
    }
    public void Update(){
        org.lwjgl.opengl.Display.update();
    }


}
