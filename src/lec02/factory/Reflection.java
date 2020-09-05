package lec02.factory;

//import java.util.Date;

/**
 * Created by Administrator on 2020/9/5.
 */
public class Reflection {
    public static void main(String[] args) {
        Object date = null;

        try {
            date = Class.forName("java.util.Date").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        // System.out.println(date instanceof  java.util.Date);
    }
}
