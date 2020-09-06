package lec04.chainresponsibility.joke;

/**
 * Created by Administrator on 2020/9/6.
 */
public interface GirlHandler {
    void readLetter(String letter);

    void setPrevGirlHandler(GirlHandler prevGirlHander);
}
