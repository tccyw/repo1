package chapter11;

import java.awt.*;

public class PanelTest {

    public static void main(String[] args) {

        Frame f = new Frame("测试窗口");
        //创建一个panel容器
        Panel p = new Panel();
//        向panel容器中添加2个组件
        p.add(new TextField(20));
        p.add(new Button("点击我"));
        //将panel 容器添加到Frame窗口中
        f.add(p);
        f.setBounds(30, 30, 250, 120);
        f.setVisible(true);

    }



}
