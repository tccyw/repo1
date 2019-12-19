package chapter12;

import javax.swing.*;
import java.awt.*;

public class Demo6 extends JFrame {
    public Demo6(){
        setBounds(100, 100, 217, 167);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        String items[] = {"元素1", "元素2", "元素3", "元素4", "元素5", "元素6", "元素7", "元素8"};
        JList<String> jl = new JList<>(items);
//        jl.setBounds(10, 10, 100, 100);
//        c.add(jl);
        JScrollPane js = new JScrollPane(jl);
        js.setBounds(10, 10, 100, 100);
        c.add(js);
        setVisible(true);
        
    }

    public static void main(String[] args) {

        new Demo6();

    }
}
