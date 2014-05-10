package com.ipsum.graphics;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glViewport;
import static org.lwjgl.opengl.GL11.*;



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
  public void initOpenGL(){
    glViewport(0,0,this.width, this.height);
    glEnable(GL_BLEND);
    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity(); // Resets any previous projection matrices
    glOrtho(0,this.width, this.height, 0, 1, -1);
    glMatrixMode(GL_MODELVIEW);
    glEnable(GL_TEXTURE_2D);
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
