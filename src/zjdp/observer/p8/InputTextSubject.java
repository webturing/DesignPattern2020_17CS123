package zjdp.observer.p8;

import java.util.Observable;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class InputTextSubject extends Observable {
    String content;
    JTextArea text;

    InputTextSubject() {
        text = new JTextArea(10, 15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        (text.getDocument()).addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                content = text.getText();
                setChanged();
                notifyObservers(content);
            }

            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }
        });
    }

    public String getContent() {
        return content;
    }

    public JTextArea getJTextArea() {
        return text;
    }
}
