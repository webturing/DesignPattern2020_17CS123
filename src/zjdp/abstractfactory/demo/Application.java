package zjdp.abstractfactory.demo;

public class Application {
    public static void main(String[] args) {
        Factory kfc = new KFC();
        kfc.createFriedChicken();
        Factory mcdonald = new McDonald();
        mcdonald.createFriedChicken();
    }
}
