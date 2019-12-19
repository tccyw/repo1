package chapter12;

import javax.swing.*;
import java.awt.*;


public class Demo5 {
    private JFrame f = new JFrame("测试窗口");
    private GridBagLayout gb = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();
    private JButton[] bs = new JButton[10];
    public void init(){
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(gb);


        for (int i = 0; i < bs.length; i++) {
            bs[i] = new JButton("按钮" + i);

        }
        gb.setConstraints(bs[0], gbc);
        f.add(bs[0]);
        gbc.weightx=0;
        gbc.gridx = 1;
        gbc.gridy =1;

        gb.setConstraints(bs[1], gbc);
        f.add(bs[1]);
        gbc.gridx = 2;
        gbc.gridy = 2;

        gb.setConstraints(bs[2], gbc);
        f.add(bs[2]);
        gbc.gridx = 3;
        gbc.gridy = 3;


        gbc.fill = GridBagConstraints.BOTH;
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Demo5().init();

    }


}
