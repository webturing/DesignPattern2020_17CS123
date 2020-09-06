package lec04.chainresponsibility.p01;

/**
 * Created by Administrator on 2020/9/6.
 */
public class MiddleFactorialHandler implements FactorialHandler {

    FactorialHandler nextHandler;


    public MiddleFactorialHandler() {
        this(null);
    }

    public MiddleFactorialHandler(FactorialHandler nextHandler) {
        this.nextHandler = nextHandler;

    }

    @Override
    public void handleRequest(int n) {
        if (n <= 20) {
            System.out.println(getClass().getName() + ", I can handle it!");
            long s = 1;
            for (int i = 2; i <= n; i++) {
                s *= i;
            }
            System.out.println(n + "!=" + s);
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
