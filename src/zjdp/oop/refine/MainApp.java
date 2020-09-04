package zjdp.oop.refine;

public class MainApp {
    public static void main(String[] args) {
        Circle bottom = new Circle(4);
        Pillar p = new Pillar(bottom, 4.0);
        System.out.println(p.getVolume());
        // 如何生成底为椭圆或者方形的圆柱呢？
        p.setBottom(new Rectangle(3, 4));
        System.out.println(p.getVolume());
    }
}
