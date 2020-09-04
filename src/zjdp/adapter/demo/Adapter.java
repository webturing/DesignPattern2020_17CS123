package zjdp.adapter.demo;

public class Adapter implements VGA, USB {
    USB input;
    VGA output;

    public void connectUSB(USB adaptee) {
        input = adaptee;
    }

    public void connectVGA(VGA adaptee) {
        output = adaptee;
    }

    public void work() {
        System.out.println("接受到usb信号");
        System.out.println("我知道将usb转化为vga信号");
        System.out.println("输出vga信号");
    }
}
