package zjdp.proxy.p7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RemoteConcreteWindow extends UnicastRemoteObject
        implements RemoteWindow, ActionListener {
    JFrame window;
    JTextArea text;
    JButton open, save;
    JFileChooser fileChooser;

    RemoteConcreteWindow() throws RemoteException {
        window = new JFrame();
        text = new JTextArea();
        open = new JButton("打开");
        open.addActionListener(this);
        save = new JButton("保存");
        fileChooser = new JFileChooser("c:/");
        JPanel panel = new JPanel();
        panel.add(open);
        panel.add(save);
        window.add(text, BorderLayout.CENTER);
        window.add(panel, BorderLayout.SOUTH);
        window.setSize(300, 300);
    }

    public JFrame getWindow() throws RemoteException {
        return window;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            text.setText(null);
            int n = fileChooser.showOpenDialog(null);
            if (n == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    FileReader readfile = new FileReader(file);
                    BufferedReader in = new BufferedReader(readfile);
                    String s = null;
                    while ((s = in.readLine()) != null)
                        text.append(s + "\n");
                } catch (IOException ee) {
                }
            }
        }
        if (e.getSource() == save) {
            int n = fileChooser.showSaveDialog(null);
            if (n == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    FileWriter outOne = new FileWriter(file);
                    BufferedWriter outTwo = new BufferedWriter(outOne);
                    outTwo.write(text.getText());
                } catch (IOException ee) {
                }
            }
        }
    }
}

