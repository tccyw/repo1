package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogDemo extends JDialog {
    public JDialogDemo(JFrame frame){
        super(frame, "标题", true);
        Container c = getContentPane();
        c.add(new JLabel("这是一个对话框"));

        setBounds(100, 100, 200, 300);
//        setVisible(true);

    }

    public static void main(String[] args) {

        JFrame f = new JFrame("父窗体");
        f.setBounds(200, 200, 300, 300);
        Container c = f.getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("弹出对话框");

        c.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialogDemo jDialogDemo = new JDialogDemo(f);
                jDialogDemo.setVisible(true);
            }
        });

    }
}
