package com.ipsum;


import com.ipsum.graphics.Screen;

public class Game
{

    public Game()
    {
        /* Create the display */
        Screen Screen = new com.ipsum.graphics.Screen(800,600);

        /* Main-Loop */
        while(!Screen.isCloseRequested())
        {

            Screen.Update();
        }





    }






    public static void main(String[] args)
    {
        new Game();
    }

}
