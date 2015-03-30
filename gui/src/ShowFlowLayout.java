import javax.swing.*;
import java.awt.*;

public class ShowFlowLayout extends JFrame{

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
//        JButton jbtOk = new JButton("ok");
//        frame.add(jbtOk);
        frame.setTitle("test");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public ShowFlowLayout() {
       setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        add(new JLabel("first"));
        add(new JTextField(5));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last"));
        add(new JTextField(8));

    }
}
