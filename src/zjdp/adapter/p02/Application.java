package zjdp.adapter.p02;

public class Application {
    public static void main(String args[]) {
        ThreeElectricOutlet outlet; // 目标接口（三相插座）
        Wash wash = new Wash(); // 洗衣机
        outlet = wash; // 洗衣机插在三相插座上
        System.out.println("使用三相插座接通电流：");
        outlet.connectElectricCurrent(); // 接通电流，开始洗衣服
        TV tv = new TV(); // 电视机
        TreeElectricAdapter adapter = new TreeElectricAdapter(tv);// 把电视插在适配器上
        outlet = adapter; // 适配器插在三相插座上
        System.out.println("使用三相插座接通电流：");
        outlet.connectElectricCurrent(); // 接通电流，开始播放电视节目
    }
}
