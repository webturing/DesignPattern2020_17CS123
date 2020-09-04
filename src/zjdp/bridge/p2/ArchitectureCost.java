package zjdp.bridge.p2;

public abstract class ArchitectureCost {
    BuildingDesign design;
    double unitPrice;

    public abstract double giveCost();
}
