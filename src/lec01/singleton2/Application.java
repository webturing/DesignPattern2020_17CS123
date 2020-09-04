package lec01.singleton2;

import java.util.Calendar;

public class Application {
    public static void main(String[] args) {
        Moon chinaMoon = Moon.getInstance();
        Moon usaMoon = Moon.getInstance();
        System.out.println(chinaMoon);
        System.out.println(usaMoon);
        Runtime runtime = Runtime.getRuntime();
        Calendar calendar = Calendar.getInstance();

    }
}
