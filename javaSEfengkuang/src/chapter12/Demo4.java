package chapter12;

import javax.swing.*;
import java.awt.*;

public class Demo4 extends JFrame {
    public Demo4(){
        setBounds(100, 100, 190, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JComboBox<String> comboBox = new JComboBox<>();
//        comboBox.addItem("草书");
//        comboBox.addItem("隶书");
//        comboBox.addItem("正楷");
        String[] items1 = {"数据1", "数据2", "数据3"};
        JComboBox<String> comboBox1 = new JComboBox<>(items1);

        String[] items = {"身份证", "学生证", "军人证"};
        ComboBoxModel cm = new DefaultComboBoxModel<>(items);
        comboBox.setModel(cm);

        JButton btn = new JButton("打印" +
                "");
        comboBox1.setBounds(50, 50, 80, 21);
        comboBox.setBounds(50, 10, 80, 21);
        c.add(comboBox);
        c.add(comboBox1);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo4();
    }


}
