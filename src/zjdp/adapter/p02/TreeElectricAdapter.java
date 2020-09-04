package zjdp.adapter.p02;

public class TreeElectricAdapter implements ThreeElectricOutlet {
    TwoElectricOutlet outlet;

    TreeElectricAdapter(TwoElectricOutlet outlet) {
        this.outlet = outlet;
    }

    public void connectElectricCurrent() {
        outlet.connectElectricCurrent();
    }
}