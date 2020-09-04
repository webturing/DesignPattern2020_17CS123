package zjdp.mediator.p6;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application extends JFrame {
    ConcreteMediator mediator;
    RedLight SNredLight;    // �ϱ�����ĺ��
    GreenLight SNgreenLight;
    YellowLight SNyellowLight;
    RedLight EWredLight;    // ��������ĺ��
    GreenLight EWgreenLight;
    YellowLight EWyellowLight;

    Application() {
        mediator = new ConcreteMediator();
        SNredLight = new RedLight();
        SNgreenLight = new GreenLight();
        SNyellowLight = new YellowLight();
        EWredLight = new RedLight();
        EWgreenLight = new GreenLight();
        EWyellowLight = new YellowLight();
        Box westBox = Box.createVerticalBox();
        westBox.add(EWgreenLight);
        westBox.add(EWyellowLight);
        westBox.add(EWredLight);
        Box northBox = Box.createHorizontalBox();
        northBox.add(SNredLight);
        northBox.add(SNyellowLight);
        northBox.add(SNgreenLight);
        JPanel pNorth = new JPanel();
        pNorth.add(northBox);
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        add(pNorth, BorderLayout.NORTH);
        add(westBox, BorderLayout.WEST);
        JButton road = new JButton(new ImageIcon("road.jpg"));
        add(road, BorderLayout.CENTER);
        register();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mediator.startRun();
    }

    private void register() {
        mediator.registerSNRedLight(SNredLight);
        mediator.registerSNGreenLight(SNgreenLight);
        mediator.registerSNYellowLight(SNyellowLight);
        mediator.registerEWRedLight(EWredLight);
        mediator.registerEWGreenLight(EWgreenLight);
        mediator.registerEWYellowLight(EWyellowLight);
    }

    public static void main(String args[]) {
        Application application = new Application();
        application.setBounds(100, 200, 300, 300);
        application.setVisible(true);
    }
}
