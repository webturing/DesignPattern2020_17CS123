package zjdp.memo.p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dp.lec23.memo.p2.tom.jiafei.Memento;

public class Caretaker {
    File file;
    private Memento memento = null;

    Caretaker() {
        file = new File("saveObject.txt");
    }

    public Memento getMemento() {
        if (file.exists()) {
            try {
                FileInputStream in = new FileInputStream("saveObject.txt");
                ObjectInputStream inObject = new ObjectInputStream(in);
                memento = (Memento) inObject.readObject();
            } catch (Exception exp) {
            }
        }
        return memento;
    }

    public void saveMemento(Memento memento) {
        try {
            FileOutputStream out = new FileOutputStream("saveObject.txt");
            ObjectOutputStream outObject = new ObjectOutputStream(out);
            outObject.writeObject(memento);
        } catch (Exception exp) {
        }
    }
}