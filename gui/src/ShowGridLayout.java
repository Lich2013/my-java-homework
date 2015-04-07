import javax.swing.*;
import java.awt.*;

/**
 * Created by lzy on 2015/3/31.
 */
public class ShowGridLayout extends JFrame{
    public ShowGridLayout() {
        setLayout(new GridLayout(5, 5, 5, 5));

        add(new JLabel("sss"));
        add(new JTextField(8));
        add(new JLabel("sss1"));
        add(new JTextField(1));
        add(new JLabel("Last"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("test1");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
