package animation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lzy on 2015/5/15.
 */
public class GuiModel extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        int screenHeight, screenWidth;
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        frame.setSize(screenWidth / 2, screenHeight / 2);
        frame.setLocationRelativeTo(null);
        Panel main = new Panel();
        Panel tool = new Panel();
        JButton start = new JButton("start");
        JButton end = new JButton("end");
        RunActionListener startAction = new RunActionListener();
        RunActionListener endAction = new RunActionListener();
        start.addActionListener(startAction);
        end.addActionListener(endAction);
        tool.add(start);
        tool.add(end);
        frame.add(tool, BorderLayout.SOUTH);
        frame.add(main, BorderLayout.CENTER);
    }

}
