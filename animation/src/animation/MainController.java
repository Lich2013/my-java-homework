package animation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lzy on 2015/5/15.
 */
public class MainController {

    public static void main(String[] args) {
        GuiModel gui = new GuiModel();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        int screenHeight, screenWidth;
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        gui.setSize(screenWidth / 2, screenHeight / 2);
        gui.setLocationRelativeTo(null);

    }

}
