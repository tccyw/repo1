package chapter12;

import javax.swing.*;
import java.awt.*;

public class Demo3 extends JFrame {
    public Demo3(){
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 5));
        for (int i = 0; i < 21; i++) {
            c.add(new JButton("按钮" + 2 * i));

        }
        setVisible(true);

    }

    public static void main(String[] args) {
        new Demo3();
    }
}
