package lec04.chainresponsibility.p01;


/**
 * Created by Administrator on 2020/9/6.
 */
public class SmallFactorialHandler implements FactorialHandler {
    public SmallFactorialHandler(FactorialHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public SmallFactorialHandler() {
        this.nextHandler = null;
    }

    FactorialHandler nextHandler;

    @Override
    public void handleRequest(int n) {
        if (n <= 12) {
            System.out.println(getClass().getName() + ", I can handle it!");
            int s = 1;
            for (int i = 2; i <= n; i++) {
                s *= i;
            }
            System.out.println(n + "! =" + s);
        } else {
            System.out.println(getClass().getName() + ", I can not handle it!");
            if (nextHandler != null) {
                nextHandler.handleRequest(n);
            }
        }
    }

    @Override
    public void setNextHandler(FactorialHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
