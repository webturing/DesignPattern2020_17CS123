package zjdp.adapter.p02;

class TV implements TwoElectricOutlet { // 电视机使用两相插座
    String name;

    TV() {
        name = "长江电视机";
    }

    TV(String s) {
        name = s;
    }

    public void connectElectricCurrent() {
        turnOn();
    }

    public void turnOn() {
        System.out.println(name + "开始播放节目。");
    }
}