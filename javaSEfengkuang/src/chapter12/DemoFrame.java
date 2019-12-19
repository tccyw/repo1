package chapter12;

import javax.swing.*;
import java.awt.*;

public class DemoFrame extends JFrame {
    public DemoFrame() {
        setBounds(100, 100, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        setVisible(true);

        JLabel l = new JLabel("这是一个标签");
//        l.setText("更改标签内容");
//        System.out.println(l.getText());
        l.setFont(new Font("黑体", Font.BOLD, 15));
        l.setForeground(Color.RED);

        c.add(l);

    }

    public static void main(String[] args) {
        new DemoFrame();
    }
}
