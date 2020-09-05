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
/**
 * BUILDER—MM最爱听的就是"我爱你"这句话了，
 * 见到不同地方的MM,要能够用她们的方言跟她说这句话哦，
 * 我有一个多种语言翻译机，上面每种语言都有一个按键，
 * 见到MM我只要按对应的键，它就能够用相应的语言说出"我爱你"这句话了，
 * 国外的MM也可以轻松搞掂，这就是我的"我爱你"builder。
 * （这一定比美军在伊拉克用的翻译机好卖） 建造模式：
 * 将产品的内部表象和产品的生成过程分割开来，从而使一个建造过程生成具有不同的内部表象的产
 * 品对象。建造模式使得产品内部表象可以独立的变化，客户不必知道产品内部组成的细节。
 * 建造模式可以强制实行一种分步骤进行的建造过程。
 */