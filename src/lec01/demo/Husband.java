package lec01.demo;

public class Husband {
    protected String name;
    protected int age;
    protected String info;

    private Husband() {
        this.name = "韦小宝";
        this.age = 18;
        this.info = "人见人爱，花见花开，车间车爆胎";

    }

    private static Husband instance = new Husband();

    public static Husband getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "档案: 名字叫"+name+"，今年"+age+"岁,座右铭是"+info;
    }
}
