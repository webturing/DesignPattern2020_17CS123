package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public class Application {
    public static void main(String[] args) {
        Builder chineseLoveLetterBuilder = new ChineseLoveLetterBuilder();
        Director director = new Director(chineseLoveLetterBuilder);
        LoverLetter letter = director.buildLetter();
        System.out.println(letter);
        Builder englishLoverLetterBuilder = new EnglishLoveLetterBuilder();
        director = new Director(englishLoverLetterBuilder);
        letter = director.buildLetter();
        System.out.println(letter);
    }
}
