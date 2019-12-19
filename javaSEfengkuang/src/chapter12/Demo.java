package chapter12;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100, 100, 200, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null);
        JButton b1 = new JButton("按钮1"), b2 = new JButton("按钮2");
        b1.setBounds(10, 30, 80, 30);
        b2.setBounds(60, 70, 100, 20);
        c.add(b1);
        c.add(b2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
