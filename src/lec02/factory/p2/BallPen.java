package lec02.factory.p2;

public abstract class BallPen {
    BallPen() {
        System.out.println("������һֻװ��" + getPenCore().color + "��о��Բ���");
    }

    public abstract PenCore getPenCore(); // ��������
}
