import java.awt.*;
import java.applet.*;

public class Background {
    public static void drawGround(Graphics g)
    {
        g.setColor(new Color(0,208,5));
        g.fillRect(0,325,1000,650);

    }
    public static void drawSky(Graphics g)
    {
        // Sky Blue
        g.setColor(new Color(106,222,250));
        g.fillRect(0,0,1000,325);

    }
}