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
    public static void main(String[] args){
        GuiModel gui = new GuiModel();
        gui.frame();
    }
    public void frame() {
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
        this.tool = new Panel();
        makeButton("start");
        makeButton("end");
        frame.add(this.tool, BorderLayout.SOUTH);
        frame.add(main, BorderLayout.CENTER);
    }

    public void makeButton(String name) {
        JButton button = new JButton(name);
        this.tool.add(button);
        RunActionListener action = new RunActionListener();
        button.addActionListener(action);
    }

    private class RunActionListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

        }

    }

}
