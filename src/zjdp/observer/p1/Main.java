package zjdp.observer.p1;

public class Main {
    public static void main(String[] args) {
        Subject s = new Newspaper();
        Subject t = new Email();
        Observer you = new Student();
        Observer me = new Teacher();
        s.addObserver(you);
        t.addObserver(you);
        s.addObserver(me);
        s.setContents("new Message");
        t.setContents("Email content");
    }
}
