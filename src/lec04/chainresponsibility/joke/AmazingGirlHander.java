package lec04.chainresponsibility.joke;

/**
 * Created by Administrator on 2020/9/6.
 */
public class AmazingGirlHander implements GirlHandler {
    GirlHandler prevGirlHandler;

    @Override
    public void readLetter(String letter) {
        if (letter.contains("amazing")) {
            System.out.println("I am an amazing girl,I like it~");
        } else {
            System.out.println("I am an amazing girl,I dislike it~");
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
