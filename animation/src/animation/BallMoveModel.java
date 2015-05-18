package animation;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by lzy on 2015/5/17.
 */
public class BallMoveModel {
    private static final int width = 15;    //球宽, px
    private static final int height = 15;   //球高, px
    private double x = 0;                   //起始位置x
    private double y = 0;                   //起始位置y
    private double dx = 1;                  //每次移动x
    private double dy = 1;                  //每次移动y

    //移动
    public void move(Rectangle2D bounds) {
        x += dx;
        y += dy;
        if (x < bounds.getMinX()) {
            x = bounds.getMinX();
            System.out.println("minx");
            System.out.println(x);
            dx = -dx;
            System.out.println(dx);
        }
        if (x + width >= bounds.getMaxX()) {
            x = bounds.getMaxX() - width;
            System.out.println("maxx");
            System.out.println(x);
            dx = -dx;
            System.out.println(dx);
        }
        if (y < bounds.getMinY()) {
            y = bounds.getMinY();
            System.out.println("miny");
            System.out.println(y);
            dy = -dy;
            System.out.println(dy);
        }
        if (y + height >= bounds.getMaxY()) {
            y = bounds.getMaxY() - height;
            System.out.println("maxy");
            System.out.println(y);
            dy = -dy;
            System.out.println(dy);
        }
    }

    public Ellipse2D getShape() {
        return  new Ellipse2D.Double(x, y, width, height);
    }
}
