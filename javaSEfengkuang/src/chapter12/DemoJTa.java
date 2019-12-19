package chapter12;

import javax.swing.*;
import java.awt.*;

public class DemoJTa extends JFrame {
    public DemoJTa(){
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextArea ja = new JTextArea();
        ja.setText("这是文本域");
        ja.setFont(new Font("楷体", Font.BOLD, 20));
        ja.setRows(5);
        ja.setColumns(20);

        JScrollPane jsp = new JScrollPane(ja);

        c.add(jsp);

        setVisible(true);


    }

    public static void main(String[] args) {
        new DemoJTa();
    }
}
