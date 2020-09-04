package zjdp.facade.p02;

public class SafetyCheck {
    String clientPacket;

    public SafetyCheck(String clientPacket) {
        this.clientPacket = clientPacket;
    }

    public boolean isSave() {
        if (clientPacket.contains("汽油")) return false;
        else return true;
    }
}
