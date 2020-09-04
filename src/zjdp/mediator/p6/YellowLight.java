package zjdp.mediator.p6;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class YellowLight extends JLabel {
    ImageIcon onIcon, offIcon;

    YellowLight() {
        onIcon = new ImageIcon("onYellow.jpg");
        offIcon = new ImageIcon("offYellow.jpg");
        setHorizontalTextPosition(AbstractButton.CENTER);
        setVerticalTextPosition(AbstractButton.CENTER);
        setFont(new Font("宋体", Font.BOLD, 11));
    }

    public void on() {
        setIcon(onIcon);
        setText("黄灯亮");
    }

    public void off() {
        setIcon(offIcon);
        setText("黄灯灭");
    }
}