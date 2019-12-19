package chapter12;

import javax.swing.*;
import java.awt.*;

public class DemoJToolBar extends JFrame {
    public DemoJToolBar(){
        setBounds(200, 200, 500, 500);

        JPanel p = new JPanel();
        setContentPane(p);
        p.setLayout(new BorderLayout());

        JToolBar tb = new JToolBar();
        tb.setBounds(100,100,100,200);

        JButton btn1 = new JButton("选项1");
        JButton btn2 = new JButton("选项2");
        JButton btn3 = new JButton("选项3");
        for (int i = 0; i < 3; i++) {

            tb.add(new JButton("选项卡" + i));

        }
        btn1.setBounds(10, 10, 50, 50);
        tb.add(btn1);
        tb.setFloatable(true);
        p.add(tb, BorderLayout.SOUTH);

        setVisible(true);

    }

    public static void main(String[] args) {

        new DemoJToolBar();

    }
}
