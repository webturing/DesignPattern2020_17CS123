package lec01.p01;

public class Circle implements Shape2D {
    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
