package zjdp.adapter.demo;

public class Projecter implements VGA {
    @Override
    public void work() {
        System.out.println("Project::vgaWork() called");
        System.out.println("接收到vga信号，开始投影");
    }
}
