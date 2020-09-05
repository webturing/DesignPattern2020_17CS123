package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    LoverLetter buildLetter() {
        builder.setSubject();
        builder.setPredict();
        builder.setObject();
        LoverLetter letter = builder.getLetter();
        return letter;
    }
}
