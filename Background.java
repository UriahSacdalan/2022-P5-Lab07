import java.awt.*;
import java.applet.*;

public class Background {
    public static void drawGround(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(0,325,1000,650);

    }
    public static void drawSky(Graphics g)
    {
        // Sky Blue
        g.setColor(new Color(125,125,250));
        g.fillRect(0,0,1000,325);

    }
}