package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public class ChineseLoveLetterBuilder implements Builder {
    private LoverLetter letter;

    ChineseLoveLetterBuilder() {
        letter = new ChineseLoveLetter();
    }

    @Override
    public void setSubject() {
        letter.subject = "我";
    }

    @Override
    public void setPredict() {
        letter.predict = "爱";
    }

    @Override
    public void setObject() {
        letter.object = "你";
    }

    @Override
    public LoverLetter getLetter() {
        return letter;
    }
}
