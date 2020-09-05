package lec02.demo;

public class KFC extends Factory {
    @Override
    public Chicken createFriedChicken() {
        return new KFCChiken();
    }
}
