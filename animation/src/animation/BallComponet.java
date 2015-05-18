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
//        g2.setPaint(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
        ArrayList<BallMoveModel> copy = new ArrayList<>();
        copy.addAll(balls);
        for (BallMoveModel b : copy){
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
