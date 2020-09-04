package zjdp.facade.demo;

public class Application {
    public static void main(String[] args) {
        Camera camera = new Camera("Nikon");
        camera.lighter = new Lighter();
        camera.fastdoor = new FasterDoor();
        Person gg = new Person("Tom");
        camera.setLightCircle();
        camera.setFastDoor();
        gg.takePhoto(camera);
        Person mm = new Person("Alice");
        FoolPlayer foolplayer = new FoolPlayer();
        foolplayer.camera = camera;
        mm.playfool(foolplayer);
    }
}
