package zjdp.command.p8;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Camera extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Camera() {
        label = new JLabel("我是摄像头");
        add(label);
    }

    public void on() {
        label.setIcon(new ImageIcon("cameraOpen.jpg"));
    }

    public void off() {
        label.setIcon(new ImageIcon("cameraClosed.jpg"));
    }
}
