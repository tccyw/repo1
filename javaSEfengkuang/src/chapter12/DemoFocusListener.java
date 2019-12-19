package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class DemoFocusListener extends JFrame {
    public DemoFocusListener(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 500);



        JPanel jPanel = new JPanel();
        setContentPane(jPanel);
        jPanel.setLayout(null);

        JTextField jt1 = new JTextField(10);
        jt1.setBounds(10, 10, 66, 21);
        jPanel.add(jt1);



        JTextField jt2 = new JTextField(10);
        jt2.setBounds(10, 41, 66, 21);
        jPanel.add(jt2);


        JTextField jt3 = new JTextField(10);
        jt3.setBounds(10, 72, 66, 21);
        jPanel.add(jt3);

        JLabel jLabel1 = new JLabel("失去焦点");
        jLabel1.setBounds(86,10,66,21);
        jPanel.add(jLabel1);

        JLabel jLabel2 = new JLabel("失去焦点");
        jLabel2.setBounds(86,41,66,21);
        jPanel.add(jLabel2);

        JLabel jLabel3 = new JLabel("失去焦点");
        jLabel3.setBounds(86,72,66,21);
        jPanel.add(jLabel3);

        jt1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                jLabel1.setText("得到焦点");
                jLabel1.setForeground(Color.RED);

            }

            @Override
            public void focusLost(FocusEvent e) {
                jLabel1.setText("失去焦点");
                jLabel1.setForeground(Color.BLUE);
            }
        });

        jt2.addFocusListener(new myListener());
        jt3.addFocusListener(new myListener());

        setVisible(true);
    }

    class myListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            JTextField tmp = (JTextField) e.getSource();
            tmp.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

        }

        @Override
        public void focusLost(FocusEvent e) {
            JTextField tmp = (JTextField) e.getSource();
            tmp.setBorder(BorderFactory.createLineBorder(Color.PINK));
        }
    }


    public static void main(String[] args) {
        new DemoFocusListener();
    }
}
