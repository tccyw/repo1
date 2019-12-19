package chapter12;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class BorderTest extends JFrame {
    public BorderTest(){
        setLayout(new GridLayout(2, 4));
        Border bb = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.RED, Color.GREEN, Color.BLUE, Color.GRAY);
        add(getPanelWithBorder(bb, "BevelBorder"));

        Border lb = BorderFactory.createLineBorder(Color.ORANGE, 10);
        add(getPanelWithBorder(lb, "LineBorder"));


        Border eb = BorderFactory.createEmptyBorder(25,10,5,30);
//        add(getPanelWithBorder(eb, "emptyBorder"));

        JPanel p = new JPanel();
        p.add(new JLabel("emptyBorder"));
        p.setBorder(eb);
        add(p);

        Border etb = BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.YELLOW,Color.BLUE);
        add(getPanelWithBorder(etb, "EtchedBorder"));

        pack();
        setVisible(true);

    }

    public JPanel getPanelWithBorder(Border b, String BorderName) {
        JPanel p = new JPanel();
        p.add(new JLabel(BorderName));
        p.setBorder(b);
        return p;
    }

    public static void main(String[] args) {
        new BorderTest();

    }

}
