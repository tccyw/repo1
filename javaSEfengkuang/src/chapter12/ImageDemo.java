package chapter12;

import javax.swing.*;
import java.awt.*;

public class ImageDemo extends JFrame {
    public ImageDemo(){
        setBounds(100, 100, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();

        JLabel l = new JLabel("这是一个展示图片的标签");
        Icon icon = new ImageIcon("src/ico/ok.jpg");
        l.setIcon(icon);
        c.add(l);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageDemo();
    }
}
