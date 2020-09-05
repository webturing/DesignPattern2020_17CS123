package lec02.abstractfactory.p5;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class SealThree implements Seal {
    BufferedImage image;
    Graphics2D g;

    SealThree() {
        image = new BufferedImage(110, 110, BufferedImage.TYPE_INT_RGB);
        g = image.createGraphics();
        g.setColor(Color.white);
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 110, 110);
        g.fill(rect);
        g.setColor(Color.red);
        BasicStroke bs = new BasicStroke(3f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND);
        g.setStroke(bs);
        Line2D line = new Line2D.Double(5, 105, 55, 5);
        g.draw(line);
        line.setLine(55, 5, 105, 105);
        g.draw(line);
        line.setLine(105, 105, 5, 105);
        g.draw(line);
        g.setFont(new Font("����", Font.BOLD, 14));
        g.drawString("��ͨ����", 25, 78);
    }

    public Image getImage() {
        return image;
    }
}
