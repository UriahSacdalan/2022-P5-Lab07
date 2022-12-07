import java.awt.*;
import java.applet.*;

public class Sunflower {
    public static void drawCenter(Graphics g)
    {
        g.setColor(new Color(123,61,4));
        g.fillOval(737,350,25,25);

    }
    public static void drawPetals(Graphics g)
    {
        g.setColor(new Color(255,214,29));
        Polygon petal1 = new Polygon();
        petal1.addPoint(750,350);
        petal1.addPoint(770,300);
        petal1.addPoint(750,275);
        petal1.addPoint(730,300);
        petal1.addPoint(750,350);
        g.fillPolygon(petal1);

        Polygon petal2 = new Polygon();
        petal2.addPoint(750,375);
        petal2.addPoint(770,425);
        petal2.addPoint(750,450);
        petal2.addPoint(730, 425);
        petal2.addPoint(750,375);
        g.fillPolygon(petal2);

        Polygon petal3 = new Polygon();
        petal3.addPoint(735,360);
        petal3.addPoint(685,340);
        petal3.addPoint(660,360);
        petal3.addPoint(685, 380);
        petal3.addPoint(735,360);
        g.fillPolygon(petal3);

        Polygon petal4 = new Polygon();
        petal4.addPoint(763,360);
        petal4.addPoint(813,340);
        petal4.addPoint(833,360);
        petal4.addPoint(813, 380);
        petal4.addPoint(763,360);
        g.fillPolygon(petal4);

    }
    public static void drawStem(Graphics g)
    {
        g.setColor(new Color(31,122,16));
        g.fillRect(743,425,15,150);

    }
    public static void drawLeaves(Graphics g)
    {
        g.setColor(new Color(103,122,12));
        g.fillOval(718,475,25,15);
        g.fillOval(757,485,25,15);

    }
}