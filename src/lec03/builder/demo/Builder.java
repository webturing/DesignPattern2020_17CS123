package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public interface Builder {
    void setSubject();

    void setPredict();

    void setObject();

    LoverLetter getLetter();
}
