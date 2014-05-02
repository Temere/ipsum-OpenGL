package com.ipsum;


import com.ipsum.graphics.Display;

public class Game
{

    public Game()
    {
        /* Create the display */
        Display Screen = new Display(800,600);

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
