package zjdp.observer.p1;

import java.util.Vector;

public class Newspaper implements Subject {
    Newspaper() {
        observers = new Vector<Observer>();
        observers.clear();
        contents = "";
    }

    Vector<Observer> observers;
    String contents;

    public Vector<Observer> getObservers() {
        return observers;
    }

    public void setObservers(Vector<Observer> observers) {
        this.observers = observers;
        notifyAll();
    }

    public String getContent() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
        notifyObservers();// 通知列表中的Observer 推数据模式
    }

    @Override
    public void addObserver(Observer o) {
        if (!observers.contains(o)) observers.add(o);
    }

    @Override
    public void delObserver(Observer o) {
        if (observers.contains(o)) observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(this);
    }
}
