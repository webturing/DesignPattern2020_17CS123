/**
 *
 */
package lec02.factory.p01.best;

/**
 * @author Administrator
 */
public class Application {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Fruit apple = Factory.createFruit("lec02.factory.p01.best.Apple");
        Fruit orange = Factory.createFruit("lec02.factory.p01.best.Orange");
        Fruit kiwi = Factory.createFruit("lec02.factory.p01.best.Kiwi");
        System.out.println(kiwi);
    }
}
