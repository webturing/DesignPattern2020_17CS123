package lec01.demo;

public class Husband {
    protected String name;
    protected int age;
    protected String info;

    private Husband() {
        this.name = "ΤС��";
        this.age = 18;
        this.info = "�˼��˰����������������䳵��̥";

    }

    private static Husband instance = new Husband();

    public static Husband getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "����: ���ֽ�"+name+"������"+age+"��,��������"+info;
    }
}
