package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public class EnglishLoveLetter extends LoverLetter {
    @Override
    LoverLetter getLetter() {
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s.", subject, predict, object);
    }
}
