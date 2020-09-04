package lec01.p01;

public class Pillar {
    Shape2D bottom;

    public Pillar(Shape2D bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    double height;

    public Shape2D getBottom() {
        return bottom;
    }

    public void setBottom(Shape2D bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return bottom.getArea() * height;
    }
}
