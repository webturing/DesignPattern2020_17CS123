package lec01.p01;

public class Application {
    public static void main(String[] args) {
        Shape2D bottom = new Circle(4);
        Pillar pillar = new Pillar(bottom, 20);
        System.out.println(pillar.getVolume());
        Shape2D rectangle = new Rectangle(3, 4);
        pillar.setBottom(rectangle);
        System.out.println(pillar.getVolume());

    }
}
