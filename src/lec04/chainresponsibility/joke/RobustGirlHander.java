package lec04.chainresponsibility.joke;

/**
 * Created by Administrator on 2020/9/6.
 */
public class RobustGirlHander implements GirlHandler {
    GirlHandler prevGirlHandler;

    @Override
    public void readLetter(String letter) {
        if (letter.length() > 5) {
            System.out.println("I am a robust girl,I like it~");
        } else {
            System.out.println("I am a robust girl,I dislike it~");
            if (prevGirlHandler != null) {
                prevGirlHandler.readLetter(letter);
            }
        }
    }

    @Override
    public void setPrevGirlHandler(GirlHandler prevGirlHander) {
        this.prevGirlHandler = prevGirlHander;

    }
}
