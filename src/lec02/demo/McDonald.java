package lec02.demo;

public class McDonald extends Factory {
    @Override
    public Chicken createFriedChicken() {
        // TODO Auto-generated method stub
        return new McDonaldCChiken();
    }
}
