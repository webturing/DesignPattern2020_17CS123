package zjdp.mediator.p5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Application extends JFrame {
    ConcreteMediator mediator;
    JMenuBar bar;
    JMenu menu;
    JMenuItem copyItem, cutItem, pasteItem;
    JTextArea text;

    Application() {
        mediator = new ConcreteMediator();
        bar = new JMenuBar();
        menu = new JMenu("编辑");
        menu.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                mediator.openMenu();
            }

            public void menuDeselected(MenuEvent e) {
            }

            public void menuCanceled(MenuEvent e) {
            }
        });
        copyItem = new JMenuItem("复制");
        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mediator.copy();
            }
        });
        cutItem = new JMenuItem("减切");
        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mediator.cut();
            }
        });
        pasteItem = new JMenuItem("粘贴");
        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mediator.paste();
            }
        });
        text = new JTextArea();
        bar.add(menu);
        menu.add(cutItem);
        menu.add(copyItem);
        menu.add(pasteItem);
        setJMenuBar(bar);
        add(text, BorderLayout.CENTER);
        register();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void register() {
        mediator.registerMenu(menu);
        mediator.registerCopyItem(copyItem);
        mediator.registerCutItem(cutItem);
        mediator.registerPasteItem(pasteItem);
        mediator.registerText(text);
    }

    public static void main(String args[]) {
        Application application = new Application();
        application.setBounds(100, 200, 300, 300);
        application.setVisible(true);
    }
}
