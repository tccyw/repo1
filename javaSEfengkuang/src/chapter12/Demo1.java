package chapter12;

import javax.swing.*;
import java.awt.*;

public class Demo1 extends JFrame {
    public Demo1() {
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JButton b1 = new JButton("中"),
                b2 = new JButton("东"),
                b3 = new JButton("南"),
                b4 = new JButton("西"),
                b5 = new JButton("北");

        c.add(b1, BorderLayout.CENTER);
        c.add(b2, BorderLayout.EAST);
        c.add(b3, BorderLayout.WEST);
        c.add(b4, BorderLayout.SOUTH);
        c.add(b5, BorderLayout.NORTH);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Demo1();
    }
}
