package zjdp.adapter.demo;

public class Application {
    public static void main(String[] args) {
        MacBook macbook = new MacBook();
        Projecter project = new Projecter();
        Adapter adapter = new Adapter();
        adapter.connectUSB(macbook);
        adapter.connectVGA(project);
        macbook.work();
        adapter.work();
        project.work();
    }
}
