package zjdp.adapter.p02;

class Wash implements ThreeElectricOutlet { // 洗衣机使用三相插座
    String name;

    Wash() {
        name = "黄河洗衣机";
    }

    Wash(String s) {
        name = s;
    }

    public void connectElectricCurrent() {
        turnOn();
    }

    public void turnOn() {
        System.out.println(name + "开始洗衣物。");
    }
}