package com.ipsum.Entity;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2i;



public class Tile {

  private int x, y, w, h;

  public Tile(int x, int y)
  {

    this.x = x;
    this.y = y;
    this.w = 10;
    this.h = 10;
  }
  public void render()
  {
    glColor4f(255, 255, 255, 255);
    glBegin(GL_QUADS);
      glVertex2i(x, y);
      glVertex2i(x + w, y);
      glVertex2i(x + w, y + h);
      glVertex2i(x, y + h);
    glEnd();
  }

}
