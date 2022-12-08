import java.awt.*;
import java.applet.*;

//The class that draws my project
public class FieldWithAFlower extends Applet{
    public void paint(Graphics g)
    {
        //Plan out project before starting
        Background.drawGround(g);
        Background.drawSky(g);

        Sun.drawCircle(g);
        Sun.drawRays(g);
        Sun.drawFace(g);

        Sunflower.drawCenter(g);
        Sunflower.drawStem(g);
        Sunflower.drawPetals(g);
        Sunflower.drawLeaves(g);
    }
}