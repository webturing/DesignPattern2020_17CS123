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
            System.out.println("大家好,我的名字叫"+name+",我还小，要好好学习~");
        } else {
            System.out.println("大家好,我的名字叫"+name+"，我的男神"+husband);
        }
    }

    void findHusband(Husband husband) {
        this.husband = husband;

    }
}
