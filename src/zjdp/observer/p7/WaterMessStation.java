package zjdp.observer.p7;

import java.util.Observable;

public class WaterMessStation extends Observable {
    double waterVelocity;    // ˮ���ٶ�
    double waterDischarge; // ˮ����

    public void giveMess(double waterVelocity, double waterDischarge) {
        if (this.waterVelocity != waterVelocity || this.waterDischarge != waterDischarge) setChanged();
        this.waterVelocity = waterVelocity;
        this.waterDischarge = waterDischarge;
        notifyObservers();
    }

    public double getWaterVelocity() {
        return waterVelocity;
    }

    public double getWaterDischarge() {
        return waterDischarge;
    }
}
