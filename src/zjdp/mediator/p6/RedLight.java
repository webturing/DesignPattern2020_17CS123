package zjdp.mediator.p6;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RedLight extends JLabel {
    ImageIcon onIcon, offIcon;

    RedLight() {
        onIcon = new ImageIcon("onRed.jpg");
        offIcon = new ImageIcon("offRed.jpg");
        setHorizontalTextPosition(AbstractButton.CENTER);
        setVerticalTextPosition(AbstractButton.CENTER);
        setFont(new Font("宋体", Font.BOLD, 11));
    }

    public void on() {
        setIcon(onIcon);
        setText("红灯亮");
    }

    public void off() {
        setIcon(offIcon);
        setText("红灯灭");
    }
}