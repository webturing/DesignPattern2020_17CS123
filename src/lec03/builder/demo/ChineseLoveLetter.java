package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public class ChineseLoveLetter extends LoverLetter {


    @Override
    public String toString() {
        return String.format("%s%s%s。", subject, predict, object);
    }
}
