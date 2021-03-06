package lec02.abstractfactory.p5;

public interface DepositSlip {
    public abstract String getBankName();

    public abstract String getClientName();

    public abstract String getClientNumber();

    public abstract int getAmountOfMoney();
}
