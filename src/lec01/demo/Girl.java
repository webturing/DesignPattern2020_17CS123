package lec01.demo;

public class Girl {
    String name;
    int age;
    Husband husband;

    Girl(String name, int age) {
        this.name = name;
        this.age = age;
        husband = null;

    }

    void showMyHusband() {

        if (husband == null) {
            System.out.println("��Һ�,�ҵ����ֽ�"+name+",�һ�С��Ҫ�ú�ѧϰ~");
        } else {
            System.out.println("��Һ�,�ҵ����ֽ�"+name+"���ҵ�����"+husband);
        }
    }

    void findHusband(Husband husband) {
        this.husband = husband;

    }
}
