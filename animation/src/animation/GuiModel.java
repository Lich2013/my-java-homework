package animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lzy on 2015/5/15.
 */
public class GuiModel extends JFrame {

    private Panel tool;
    private  BallComponet componet;
    public static final int step = 1000;

    public GuiModel () {
        int screenHeight, screenWidth;
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;

        setTitle("Animation");
        componet = new BallComponet();

        Panel main = new Panel();
        main.add(componet, BorderLayout.CENTER);
        main.setSize(screenWidth / 2, screenHeight / 2);
        add(main, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.tool = new Panel();
        makeButton(tool, "start", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBall();
            }
        });
        makeButton(tool, "end", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(this.tool, BorderLayout.SOUTH);
        pack();
    }

    public void makeButton(Panel panel, String name,ActionListener listener) {
        JButton button = new JButton(name);
        panel.add(button);
        button.addActionListener(listener);
    }

    public void addBall() {

       try {
           BallModel ball = new BallModel();
           componet.add(ball);
           for (int i = 1; i < 1000; i++) {
               ball.move(componet.getBounds());
               componet.paint(componet.getGraphics());
               Thread.sleep(3);
           }

       }
       catch (InterruptedException e){

       }
    }

}
