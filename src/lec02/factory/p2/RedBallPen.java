package lec02.factory.p2;

public class RedBallPen extends BallPen {
    public PenCore getPenCore() {
        return new RedPenCore();
    }
}