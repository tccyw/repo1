package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class SwingComponent {
    JFrame f = new JFrame("测试");
    Icon okIcon = new ImageIcon("ico/ok.jpg");
    JButton ok = new JButton("确认", okIcon);
    JRadioButton male = new JRadioButton("男", true);
    JRadioButton female = new JRadioButton("女", false);
    ButtonGroup bg = new ButtonGroup();
    JCheckBox married = new JCheckBox("是否已婚", false);
    String[] colors = new String[]{"红色", "绿色", "蓝色"};
//    定义一个下拉选项框
    JComboBox<String> colorChooser = new JComboBox<>(colors);
//    定义个列表选项框
    JList<String> colorList = new JList<>(colors);
    //   定义一个多行文本域
    JTextArea ta = new JTextArea(8, 20);

    JTextField name = new JTextField(40);

    JMenuBar mb = new JMenuBar();

    JMenu file = new JMenu("文件");
    JMenu edit = new JMenu("编辑");

    Icon newIcon = new ImageIcon("ico/ok.jpg");
    JMenuItem newItem = new JMenuItem("新建", newIcon);

    Icon saveIcon = new ImageIcon("ico/save.png");
    JMenuItem saveItem = new JMenuItem("保存", saveIcon);

    Icon copyIcon = new ImageIcon("ico/copy.png");
    JMenuItem copyItem = new JMenuItem("复制", copyIcon);

    Icon pasteIcon = new ImageIcon("ico/paste.png");
    JMenuItem pasteItem = new JMenuItem("粘贴", pasteIcon);

    JMenu format = new JMenu("格式");
    JMenuItem commentItem = new JMenuItem("注释");
    JMenuItem cancelItem = new JMenuItem("取消注释");

    JPopupMenu pop = new JPopupMenu();
    ButtonGroup flavorGroup = new ButtonGroup();

    JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal风格", true);
    JRadioButtonMenuItem nimbusITem = new JRadioButtonMenuItem("Nimbus风格");
    JRadioButtonMenuItem windowsITem = new JRadioButtonMenuItem("Windows风格");
    JRadioButtonMenuItem classicITem = new JRadioButtonMenuItem("Windows经典风格");
    JRadioButtonMenuItem motifITem = new JRadioButtonMenuItem("Motif风格");

    public void init(){
        JPanel bottom = new JPanel();
        bottom.add(name);
        bottom.add(ok);
        f.add(bottom, BorderLayout.SOUTH);

        JPanel checkPanel = new JPanel();
        checkPanel.add(colorChooser);
        bg.add(male);
        bg.add(female);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);

        Box topLeft = Box.createVerticalBox();
        JScrollPane taJsp = new JScrollPane(ta);
        topLeft.add(taJsp);
        topLeft.add(checkPanel);

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        f.add(top);

        f.pack();
        f.setVisible(true);

        newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK));
        newItem.addActionListener(e -> ta.append("用户单击了”新建菜单”\\n"));
        file.add(newItem);
        file.add(saveItem);

    }

    public static void main(String[] args) {

        new SwingComponent().init();

    }





}
