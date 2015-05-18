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
    private BallComponet componet;

    //构造图形界面
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

    //添加并监听按钮
    public void makeButton(Panel panel, String name, ActionListener listener) {
        JButton button = new JButton(name);
        panel.add(button);
        button.addActionListener(listener);
    }

    //添加球启动新线程
    public void addBall() {
        BallMoveModel ball = new BallMoveModel();
        componet.add(ball);
        Runnable r = new ThreadManageModel(ball, componet);
        new Thread(r).start();
    }

}
