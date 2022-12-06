import java.awt.*;
import java.applet.*;

public class Sun {
    public static void drawCircle(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(100,100,100,100);

    }
    public static void drawRays(Graphics g)
    {
        g.setColor(Color.yellow);
        g.drawLine(100,100,50,50);
        g.drawLine(85,145,20,145);
        g.drawLine(100,175,25,225);
        g.drawLine(150,215,150,290);
        g.drawLine(200,100,250,50);
        g.drawLine(215,145,280,145);
        g.drawLine(200,175,275,225);
        g.drawLine(150,90,150,15);

    }
    public static void drawFace(Graphics g)
    {
        g.setColor(Color.black);
        g.fillOval(125,125,15,15);
        g.fillOval(175,125,15,15);
        g.fillArc(135,150,50,25,180,180);
    }
}