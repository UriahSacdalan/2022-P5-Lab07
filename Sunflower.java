import java.awt.*;
import java.applet.*;

public class Sunflower {
    public static void drawCenter(Graphics g)
    {
        g.setColor(new Color(123,61,4));
        g.fillOval(750,375,25,25);

    }
    public static void drawPetals(Graphics g)
    {
        g.setColor(new Color(228,211,1));
        g.fillArc(750,325,25,25,0,180);

    }
    public static void drawStem(Graphics g)
    {

    }
    public static void drawLeaves(Graphics g)
    {

    }
}