package zjdp.facade.demo;

public class Camera {
    String brand;
    public Lighter lighter;
    public FasterDoor fastdoor;

    public Camera(String string) {
        this.brand = string;
    }

    void takePhoto() {
    }

    void setLightCircle() {
        lighter.set();
    }

    void setFastDoor() {
        fastdoor.set();
    }
}
