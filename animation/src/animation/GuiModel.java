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

        setTitle("Animation");
        componet = new BallComponet();
        add(componet, BorderLayout.CENTER);
        tool = new Panel();
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
        add(tool, BorderLayout.SOUTH);
        pack();
    }

    public void makeButton(Panel panel, String name,ActionListener listener) {
        JButton button = new JButton(name);
        panel.add(button);
        button.addActionListener(listener);
    }

    public void addBall() {
       try {
           BallMoveModel ball = new BallMoveModel();
           componet.add(ball);
           for (int i = 1; i < step; i++) {
//           while (true) {
               ball.move(componet.getBounds());
               componet.paint(componet.getGraphics());
               Thread.sleep(4);
           }

       }
       catch (InterruptedException e){

       }
    }

}
