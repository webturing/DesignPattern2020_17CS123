package zjdp.proxy.p4;

import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Application extends JFrame {
    ImageIconProxy icon;
    JButton button;

    Application() {
        try {
            icon = new ImageIconProxy(new URL("http://127.0.0.1:8080/tv.jpg"));
        } catch (Exception exp) {
        }
        button = new JButton();
        add(button, BorderLayout.CENTER);
        button.setIcon(icon);
        setSize(400, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String args[]) {
        new Application();
    }
}
 
