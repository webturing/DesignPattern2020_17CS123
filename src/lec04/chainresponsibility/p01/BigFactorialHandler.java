package lec04.chainresponsibility.p01;

import java.math.BigInteger;
import java.util.logging.Handler;

/**
 * Created by Administrator on 2020/9/6.
 */
public class BigFactorialHandler implements FactorialHandler {
    FactorialHandler nextHandler;

    @Override
    public void handleRequest(int n) {
        if (n <= 5000) {
            System.out.println(getClass().getName() + ", I can handle it!");
            BigInteger s = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                s = s.multiply(new BigInteger(String.valueOf(i)));
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
