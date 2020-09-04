package zjdp.abstractfactory.p5;

public class DepositSlip3 implements DepositSlip {
    String clientNumber;
    String clientName;
    int money;

    DepositSlip3(String clientNumber, String clientName, int money) {
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.money = money;
    }

    public String getBankName() {
        return "中国交通银行";
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public int getAmountOfMoney() {
        return money;
    }
}
