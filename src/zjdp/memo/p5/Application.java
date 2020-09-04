﻿package zjdp.memo.p5;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application extends JFrame implements MouseListener {
    UnicodeLabel label;
    Caretaker caretaker;      //负责人

    Application() {
        label = new UnicodeLabel();
        label.addMouseListener(this);
        add(new JLabel("单击左键显示一个汉字，单击右键撤销单击左键的操作效果"),
                BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        caretaker = new Caretaker();             //创建负责人
    }

    public void mousePressed(MouseEvent e) {
        if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
            caretaker.saveMemento(label.createMemento());    //保存备忘录
        }
        if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
            UnicodeLabel.Memento memento = caretaker.getMemento();     //得到备忘录
            if (memento != null) {
                label.restoreFromMemento(memento);  //使用备忘录恢复状态
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public static void main(String args[]) {
        Application win = new Application();
        win.setBounds(10, 10, 300, 300);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
