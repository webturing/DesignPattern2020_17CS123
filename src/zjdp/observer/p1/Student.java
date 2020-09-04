/**
 *
 */
package zjdp.observer.p1;

/**
 * @author Administrator
 */
public class Student implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println(getClass().getName() + " reading " + subject.getContent());
    }
}
