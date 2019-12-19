package chapter11;

import javax.swing.*;
import java.awt.*;

public class ScrollPaneTest {
    public static void main(String[] args) {

        JFrame f = new JFrame("洗");
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        sp.add(new TextField());
        sp.add(new Button("点击我"));
        f.add(sp);
        f.setBounds(30, 30, 250, 120);
        f.setVisible(true);

    }
}
