package com.ipsum;


import com.ipsum.graphics.Screen;
import com.ipsum.Entity.Tile;

public class Game
{

  public Game()
  {

    /* Create the display */
    Screen Screen = new com.ipsum.graphics.Screen(800,600);
    Tile t = new Tile(10,10);

    Screen.initOpenGL();

    /* Main-Loop */
    while(!Screen.isCloseRequested())
    {
      t.render();
      Screen.Update();
    }





  }
  public static void main(String[] args)
  {
      new Game();
  }

}
