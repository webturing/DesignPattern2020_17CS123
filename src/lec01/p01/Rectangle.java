package lec01.p01;

public class Rectangle implements Shape2D {
    private double height;
    private double width;

    @Override
    public double getArea() {
        return height * width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
}
