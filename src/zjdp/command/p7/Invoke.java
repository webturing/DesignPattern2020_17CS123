package zjdp.command.p7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Invoke {
    JButton button;    // 我们需要的按钮
    Command command;

    Invoke() {
        button = new JButton();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executeCommand();
            }
        });
    }

    public void setCommand(Command command) {
        this.command = command;
        button.setText(command.getName()); // 按钮显示命令的名称
    }

    public JButton getButton() {
        return button;
    }

    private void executeCommand() {
        command.execute();
    }
}
