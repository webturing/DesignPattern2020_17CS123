package zjdp.abstractfactory.demo;

public class KFC extends Factory {
    @Override
    public Chicken createFriedChicken() {
        return new KFCChiken();
    }
}
