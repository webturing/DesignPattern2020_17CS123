package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public class EnglishLoveLetterBuilder implements Builder {
    private LoverLetter letter;

    EnglishLoveLetterBuilder() {
        letter = new EnglishLoveLetter();
    }

    @Override
    public void setSubject() {
        letter.subject = "I";
    }

    @Override
    public void setPredict() {
        letter.predict = "LOVE";
    }

    @Override
    public void setObject() {
        letter.object = "YOU";
    }

    @Override
    public LoverLetter getLetter() {
        return letter;
    }
}
