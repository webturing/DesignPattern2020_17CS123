/**
 *
 */
package zjdp.oop.refine;

/**
 * @author Administrator
 */
public class Rectangle extends Geometry {
    protected double length, width;

    /**
     *
     */
    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /*
     * (non-Javadoc)
     *
     * @see dp.lec01.refine.Geometry#getArea()
     */
    @Override
    public double getArea() {
        return length * width;
    }
}
