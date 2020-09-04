package zjdp.observer.p1;

public class Teacher implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println(getClass().getName() + " reading " + subject.getContent());
    }
}
