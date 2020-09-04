package zjdp.command.p8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Invoke {
    JButton button;
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
        button.setText(command.getName());
    }

    public JButton getButton() {
        return button;
    }

    private void executeCommand() {
        command.execute();
    }
}
