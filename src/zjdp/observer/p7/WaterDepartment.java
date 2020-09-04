package zjdp.observer.p7;

import java.util.Observable;
import java.util.Observer;

public class WaterDepartment implements Observer {
    Observable subject;
    double waterVelocity;    // ˮ���ٶ�
    double waterDischarge; // ˮ����

    WaterDepartment(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(Observable subject, Object object) {
        if (subject instanceof WaterMessStation) {
            WaterMessStation WMS = (WaterMessStation) subject;
            waterVelocity = WMS.getWaterVelocity();
            waterDischarge = WMS.getWaterDischarge();
            System.out.print("ˮ�����٣���/�룩:" + waterVelocity + "��");
            System.out.println("������������/�룩:" + waterDischarge);
        }
    }
}
