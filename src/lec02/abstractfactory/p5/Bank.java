package lec02.abstractfactory.p5;

public abstract class Bank {
    public abstract DepositSlip createDepositSlip(String number, String name, int money);

    public abstract Seal createSeal();
}
