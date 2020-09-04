/**
 *
 */
package zjdp.observer.p1;

/**
 * @author Administrator
 */
public interface Subject {
    public void addObserver(Observer o);

    public void delObserver(Observer o);

    public void notifyObservers();

    public void setContents(String content);

    public String getContent();
}
