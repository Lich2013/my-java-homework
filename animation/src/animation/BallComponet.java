package animation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lzy on 2015/5/17.
 */
public class BallComponet extends JPanel {
    private java.util.List<BallMoveModel> balls = new ArrayList<>();

    public void add(BallMoveModel b) {
        balls.add(b);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (BallMoveModel b : balls){
            g2.fill(b.getShape());
        }
    }

    public Dimension getPreferredSize() {
        int screenHeight, screenWidth;
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        return new Dimension(screenHeight / 2, screenWidth / 2);
    }
}
