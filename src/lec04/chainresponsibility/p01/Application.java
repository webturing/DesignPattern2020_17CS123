package lec04.chainresponsibility.p01;

/**
 * Created by Administrator on 2020/9/6.
 */
public class Application {
    public static void main(String[] args) {
        FactorialHandler smallFactorialHandler = new SmallFactorialHandler();
        FactorialHandler middleFactorialHandler = new MiddleFactorialHandler();
        FactorialHandler bigFactorialHandler = new BigFactorialHandler();


        smallFactorialHandler.setNextHandler(middleFactorialHandler);
        middleFactorialHandler.setNextHandler(bigFactorialHandler);


        int n = 5;
        smallFactorialHandler.handleRequest(n);
    }
}
