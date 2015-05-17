package animation;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by lzy on 2015/5/17.
 */
public class BallModel {
    private static final int width = 15;
    private static final int height = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;

    public void move(Rectangle2D bounds) {
        x += dx;
        y += dy;
        if (x < bounds.getMinX()) {
            x = bounds.getMinX();
            dx = -dx;
        }
        if (x + width >= bounds.getMaxX()) {
            x = bounds.getMaxX() - width;
            dx = -dx;
        }
        if (y < bounds.getMinY()) {
            y = bounds.getMinY();
            dx = -dy;
        }
        if (y + width >= bounds.getMaxY()) {
            y = bounds.getMaxY() - width;
            dy = -dy;
        }
    }

    public Ellipse2D getShape() {
        return  new Ellipse2D.Double(x, y, width, height);
    }
}
