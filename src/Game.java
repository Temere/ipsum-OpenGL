import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Game
{

    public Game()
    {
        /* Create the display */
        try
        {
            org.lwjgl.opengl.Display.setDisplayMode(new DisplayMode(800, 600));
            org.lwjgl.opengl.Display.create();
            org.lwjgl.opengl.Display.setResizable(true);
        }
        catch (LWJGLException e)
        {
            e.printStackTrace();
        }

        /* Main-Loop */
        while(!Display.isCloseRequested())
        {


            Display.update();
        }





    }






    public static void main(String[] args)
    {
        new Game();
    }

}
