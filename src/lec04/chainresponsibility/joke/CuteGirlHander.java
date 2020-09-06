package lec04.chainresponsibility.joke;

/**
 * Created by Administrator on 2020/9/6.
 */
public class CuteGirlHander implements GirlHandler {
    GirlHandler prevGirlHandler;

    @Override
    public void readLetter(String letter) {
        if (letter.contains("cute")) {
            System.out.println("I am a cute girl,I like it~");
        } else {
            System.out.println("I am a cute girl,I dislike it~");
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
