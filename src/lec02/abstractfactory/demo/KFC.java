package lec02.abstractfactory.demo;

public class KFC extends Factory {
    @Override
    public Chicken createFriedChicken() {
        return new KFCChiken();
    }
}
