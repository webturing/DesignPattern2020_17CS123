package zjdp.command.p8;

public class OffCameraCommand implements Command {
    Camera camera;

    OffCameraCommand(Camera camera) {
        this.camera = camera;
    }

    public void execute() {
        camera.off();
    }

    public String getName() {
        return "关闭摄像头";
    }
}
