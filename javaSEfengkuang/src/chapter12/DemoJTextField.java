package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJTextField extends JFrame {
    public DemoJTextField(){
        setBounds(300, 300, 350, 350);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        JTextField jt = new JTextField();
        jt.setColumns(20);
        jt.setText("哎哎哎");
        jt.setFont(new Font("楷体", Font.PLAIN, 20));
        c.add(jt);

        JButton btn = new JButton("确认");
        c.add(btn);
        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("文本框中的内容为" + jt.getText());
                jt.setText("");
                jt.requestFocus();

            }
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new DemoJTextField();
    }
}
