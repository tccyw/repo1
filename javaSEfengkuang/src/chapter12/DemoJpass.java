package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJpass extends JFrame {
    public DemoJpass(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        Container c=getContentPane();
        JPasswordField jp = new JPasswordField();
        jp.setColumns(20);
//        jp.setFont(new Font("Arial", Font.BOLD, 18));
        jp.setEchoChar('\u2605');

        jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char ch[] = jp.getPassword();
                String str = new String(ch);
                System.out.println(str);
                jp.setText("");
                jp.requestFocus();

            }
        });
        c.add(jp);
        setVisible(true);

    }

    public static void main(String[] args) {
        new DemoJpass();
    }
}
