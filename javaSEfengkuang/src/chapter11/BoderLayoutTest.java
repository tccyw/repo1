package chapter11;

import java.awt.*;

public class BoderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("ceshi ");
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("南"), BorderLayout.SOUTH);
        f.add(new Button("西"), BorderLayout.WEST);
        f.add(new Button("北"), BorderLayout.NORTH);
        f.add(new Button("东"), BorderLayout.EAST);
        f.add(new Button("中"));
        f.pack();
        f.setVisible(true);

    }
}
