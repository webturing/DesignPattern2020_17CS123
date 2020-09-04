package zjdp.adapter.demo;

public class MacBook implements USB {
    @Override
    public void work() {
        System.out.println("MacBook::usbWork() called");
        System.out.println("输出usb信号");
    }
}
