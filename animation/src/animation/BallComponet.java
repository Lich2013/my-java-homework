package animation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lzy on 2015/5/17.
 */
public class BallComponet extends JPanel {
    private static final int default_width = 450;
    private static final int default_height = 350;
    private java.util.List<BallModel> balls = new ArrayList<>();

    public void add(BallModel b) {
        balls.add(b);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (BallModel b : balls){
            g2.fill(b.getShape());
        }
    }

    public  Dimension getPrferredSize() {
        return new Dimension(default_width, default_height);
    }
}
