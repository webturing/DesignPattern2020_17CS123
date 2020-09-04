package zjdp.oop.refine;

public class Pillar {
    protected Geometry bottom;

    /**
     * @return the bottom
     */
    public Geometry getBottom() {
        return bottom;
    }

    /**
     * @param bottom the bottom to set
     */
    public void setBottom(Geometry bottom) {
        this.bottom = bottom;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    protected double height;

    Pillar(Geometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolume() {
        return bottom.getArea() * height;
    }
}
