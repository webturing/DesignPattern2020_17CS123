package lec04.chainresponsibility.p01;

/**
 * Created by Administrator on 2020/9/6.
 */
public interface FactorialHandler {
    void handleRequest(int n);

    void setNextHandler(FactorialHandler nextHandler);
}
