package caculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lzy on 2015/6/14.
 */
public class Caculator extends JPanel{
    private JButton display;
    private JPanel panel;
    private boolean start;
    private String lastCommand;
    private double result;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Caculator");
        frame.setSize(1000, 680);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new Caculator());
    }

    public Caculator() {
        setLayout(new BorderLayout());
        result = 0;
        lastCommand = "=";
        start = true;
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        ActionListener insert = new InsertAction();
        ActionListener commond = new CommondAction();

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", commond);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", commond);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", commond);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", insert);
        addButton("+", commond);

        add(panel, BorderLayout.CENTER);
    }

    private void addButton(String lable, ActionListener listener) {
        JButton button = new JButton(lable);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class CommondAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String commod = event.getActionCommand();
            if (start) {
                if (commod.equals("-")) {
                    display.setText(commod);
                    start = false;
                }
                else {
                    calculate(Double.parseDouble(display.getText()));
                    lastCommand = commod;
                    start = true;
                }
            }
        }
    }

    public void calculate(double x) {
        if (lastCommand.equals("+"))
            result += x;
        else if (lastCommand.equals("-"))
            result -= x;
        else if (lastCommand.equals("*"))
            result *= x;
        else if (lastCommand.equals("/"))
            result /= x;
        else if (lastCommand.equals("="))
            result = x;
        display.setText("" + result);
    }
}
