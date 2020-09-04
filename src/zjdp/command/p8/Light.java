package zjdp.command.p8;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Light extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Light() {
        label = new JLabel("我是照明灯");
        add(label);
    }

    public void on() {
        label.setIcon(new ImageIcon("lightOpen.jpg"));
    }

    public void off() {
        label.setIcon(new ImageIcon("lightClosed.jpg"));
    }
}
