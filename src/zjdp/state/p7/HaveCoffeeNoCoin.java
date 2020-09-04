package zjdp.state.p7;

import javax.swing.ImageIcon;

public class HaveCoffeeNoCoin extends State {
    AutoCoffeeMachine machine;

    HaveCoffeeNoCoin(AutoCoffeeMachine machine) {
        this.machine = machine;
    }

    public void giveAnCupCaffee() {
        machine.messShowing.setIcon(new ImageIcon("machine.jpg"));
        showMessage();
    }

    public void showMessage() {
        machine.messShowing.setText("请投入一枚一元硬币");
    }
}  
