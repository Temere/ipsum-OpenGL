package com.ipsum.graphics;


import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Screen
{

	private int width;
	private int height;

	public Screen(int width, int height)
	{
		this.width = width;
		this.height = height;

		try
		{
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create();
			Display.setResizable(true);
		}
		catch (LWJGLException e)
		{
				e.printStackTrace();
		}
	}

	public boolean isCloseRequested()
	{
		return Display.isCloseRequested();
	}

	public void Update()
	{
  	Display.update();
  }


}
