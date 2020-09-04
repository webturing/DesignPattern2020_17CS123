package zjdp.oop.poor;

public class Pillar {
    protected Circle bottom;

    /**
     * @return the bottom
     */
    public Circle getBottom() {
        return bottom;
    }

    /**
     * @param bottom the bottom to set
     */
    public void setBottom(Circle bottom) {
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

    Pillar(Circle bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolume() {
        return bottom.getArea() * height;
    }
}
