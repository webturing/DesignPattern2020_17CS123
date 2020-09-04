package zjdp.oop.refine;

public class Circle extends Geometry {
    protected double radius;

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
