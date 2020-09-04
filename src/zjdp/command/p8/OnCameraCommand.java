package zjdp.command.p8;

public class OnCameraCommand implements Command {
    Camera camera;

    OnCameraCommand(Camera camera) {
        this.camera = camera;
    }

    public void execute() {
        camera.on();
    }

    public String getName() {
        return "打开装摄像头";
    }
}
